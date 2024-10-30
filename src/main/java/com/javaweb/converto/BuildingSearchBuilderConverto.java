package com.javaweb.converto;

import org.springframework.stereotype.Component;

import com.javaweb.BuildingConvertDTO;
import com.javaweb.builder.BuildingSearchBuilder;
@Component
public class BuildingSearchBuilderConverto {
	public BuildingSearchBuilder toBuildingSearchBuilder(BuildingConvertDTO buildingConvertDTO) {
		BuildingSearchBuilder buildingSearchBuilder=new BuildingSearchBuilder.Builder()
				                                         .setName(buildingConvertDTO.getName())
				                                         .setFloorarea(buildingConvertDTO.getFloorarea())
				                                         .setDistrictid(buildingConvertDTO.getDistrictid())
				                                         .setWard(buildingConvertDTO.getWard())
				                                         .setStreet(buildingConvertDTO.getStreet())
				                                         .setNumberofbasement(buildingConvertDTO.getNumberofbasement())
				                                         .setDirection(buildingConvertDTO.getDirection())
				                                         .setLevel(buildingConvertDTO.getLevel())
				                                         .setStartArea(buildingConvertDTO.getStartArea())
				                                         .setEndArea(buildingConvertDTO.getEndArea())
				                                         .setStartArea(buildingConvertDTO.getStartArea())
				                                         .setEndRentPrice(buildingConvertDTO.getEndRentPrice())
				                                         .setManagername(buildingConvertDTO.getManagername())
				                                         .setManagerphonenumber(buildingConvertDTO.getManagerphonenumber())
				                                         .setStaffid(buildingConvertDTO.getStaffid())
				                                         .setRentArea(buildingConvertDTO.getRentArea())
				                                         .build();
				                                         
		return buildingSearchBuilder;
	}

}
