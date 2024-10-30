package com.javaweb.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

import com.javaweb.BuildingConvertDTO;
import com.javaweb.service.BuildingService;
@RestController
public class BuildingAPI {
	@Autowired
	private BuildingService buildingService;
	
	@GetMapping(value="/api/building/")
	public List<BuildingDTO> getBuilding(@ModelAttribute BuildingConvertDTO buildingConvertDTO){
		List<BuildingDTO> Result = buildingService.findAll(buildingConvertDTO);
		return Result;
	}
	
	
	/*@RequestMapping(value="/api/building/",method = RequestMethod.GET) 
	// @GetMapping(value="/api/building/");
	public Object getBuilding(@RequestBody BuildingDTO buildingDTO) { 
		validate(buildingDTO);
		return buildingDTO;
	}
	public void validate(BuildingDTO buildingDTO){
		if(buildingDTO.getName()== null || buildingDTO.getNumberOfBasement() == null || buildingDTO.getName().equals("")) {
			throw new FieldRequiredException("name or numberOfBasement is null !!");
		}
	}
	@DeleteMapping(value="/api/building/{id}")
	public void deleteBuilding(@PathVariable Integer id) {
		System.out.println("found id to delete");
	}
	*/
	
}
