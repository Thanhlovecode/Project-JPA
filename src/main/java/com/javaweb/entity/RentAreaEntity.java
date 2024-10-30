package com.javaweb.entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="rentarea")
public class RentAreaEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="value")
	private Integer value;
	
	@ManyToOne
	@JoinColumn(name="buildingid")
	private BuildingEntity building;

	public Integer getId() {
		return id;
	}

	public Integer getValue() {
		return value;
	}

	public BuildingEntity getBuildingId() {
		return building;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public void setBuildingId(BuildingEntity buildingId) {
		this.building = buildingId;
	}
}
