package com.javaweb.repository;

import java.lang.reflect.Field;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.javaweb.builder.BuildingSearchBuilder;
import com.javaweb.entity.BuildingEntity;
import com.javaweb.utils.CheckUtil;
@Repository
@Primary
public class JPABuildingRepositoryImpl implements BuildingRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	public static void joinTable(BuildingSearchBuilder buildingSearchBuilder,StringBuilder sql) {
		if(CheckUtil.checkNumber(buildingSearchBuilder.getStaffid())) {
			sql.append(" inner join assignmentbuilding b on b.buildingid=a.id ");
		}
		if(CheckUtil.checkNumber(buildingSearchBuilder.getStartArea()) || CheckUtil.checkNumber(buildingSearchBuilder.getEndArea())) {
			sql.append(" inner join rentarea c on c.buildingid=a.id ");
		}
	}
	
	public static void queryNormal(BuildingSearchBuilder buildingSearchBuilder, StringBuilder where) {
		try {
			Field[] fields=BuildingSearchBuilder.class.getDeclaredFields();
			for(Field item: fields) {
				item.setAccessible(true);
				String fieldName= item.getName();
				if(!fieldName.equals("staffid") && !fieldName.endsWith("RentPrice") && !fieldName.endsWith("Area")) {
					Object value=item.get(buildingSearchBuilder);
					if(value !=null) {
						if(value instanceof Number) {
							where.append(" and a."+fieldName + " = " + value +" ");
						}
						else if(value instanceof String && !((String)value).isEmpty()) {
							where.append(" and a."+ fieldName + " Like '%"+ value +"%' ");
						}
					}
				}
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public static void querySpecial(BuildingSearchBuilder buildingSearchBuilder,StringBuilder where) {
		Integer staffid = buildingSearchBuilder.getStaffid();
		if(CheckUtil.checkNumber(staffid)) {
			where.append(" and b.staffid = "+ staffid);
		}
		Integer startArea=buildingSearchBuilder.getStartArea();
		Integer endArea= buildingSearchBuilder.getEndArea();
		if(CheckUtil.checkNumber(startArea)) {
			where.append(" and c.value >= "+ startArea);
		}
		if(CheckUtil.checkNumber(endArea)) {
			where.append(" and c.value <= "+ endArea);
		}
		Integer startRentPrice= buildingSearchBuilder.getStartRentPrice();
		Integer endRentPrice = buildingSearchBuilder.getEndArea();
		if(CheckUtil.checkNumber(startRentPrice)) {
			where.append(" and a.rentprice >= "+ startRentPrice);
		}
		if(CheckUtil.checkNumber(endRentPrice)) {
			where.append(" and a.rentprice <= "+ endRentPrice);
		}
	}
	
	@Override
	public List<BuildingEntity> findAll(BuildingSearchBuilder buildingSearchBuilder) {
		StringBuilder sql= new StringBuilder("select distinct a.* from building a ");
		joinTable(buildingSearchBuilder, sql);
		StringBuilder where= new StringBuilder(" Where 1=1 ");
		queryNormal(buildingSearchBuilder, where);
		querySpecial(buildingSearchBuilder, where);
		sql.append(where);
		Query query= entityManager.createNativeQuery(sql.toString(),BuildingEntity.class);
		return query.getResultList();
	}
	

}
