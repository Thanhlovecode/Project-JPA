package com.javaweb.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaweb.BuildingConvertDTO;
import com.javaweb.api.BuildingDTO;
import com.javaweb.builder.BuildingSearchBuilder;
import com.javaweb.converto.BuildingSearchBuilderConverto;
import com.javaweb.entity.BuildingEntity;
import com.javaweb.entity.RentAreaEntity;
import com.javaweb.repository.BuildingRepository;
//import com.javaweb.Entity.DistrictEntity;
@Service
public class BuildingServiceImpl implements BuildingService {
	@Autowired
	private BuildingRepository buildingRepository;
	
	@Autowired 
	private ModelMapper modelMapper;
	
	@Autowired
	private BuildingSearchBuilderConverto buildingSearchBuilderConverto;
	@Override
	public List<BuildingDTO> findAll(BuildingConvertDTO buildingConvertDTO) {
		BuildingSearchBuilder buildingSearchBuilder= buildingSearchBuilderConverto.toBuildingSearchBuilder(buildingConvertDTO);
		List<BuildingEntity> buildingEntities = buildingRepository.findAll(buildingSearchBuilder);
		List<BuildingDTO> result= new ArrayList<>();
		Integer startArea=buildingConvertDTO.getStartArea();
		Integer endArea = buildingConvertDTO.getEndArea();
	for(BuildingEntity item : buildingEntities){
		BuildingDTO building= modelMapper.map(item,BuildingDTO.class);
		building.setAddress(item.getStreet()+","+item.getWard()+","+item.getDistrictId().getName());
		List<RentAreaEntity> rentAreas=item.getRentAreas();
		String areaResult=rentAreas.stream()
				                   .filter(it->(startArea==null || it.getValue()>=startArea) && (endArea == null || it.getValue()<=endArea))
				                   .map(it->it.getValue().toString())
				                   .collect(Collectors.joining(","));
		building.setRentArea(areaResult);
		result.add(building);
	}
	return result;

 }
	
	
}
