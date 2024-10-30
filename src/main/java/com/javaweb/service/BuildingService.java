package com.javaweb.service;

import java.util.List;

import com.javaweb.BuildingConvertDTO;
import com.javaweb.api.BuildingDTO;

public interface BuildingService {
	List<BuildingDTO> findAll(BuildingConvertDTO buildingConvertDTO);
}
