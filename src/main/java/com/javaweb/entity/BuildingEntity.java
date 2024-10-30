package com.javaweb.entity;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="building")
public class BuildingEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="ward")
	private String ward;
	
	@Column(name="street")
	private String street;
	
	@Column(name="floorarea")
	private Integer floorArea;
	
	@Column(name="numberofbasement")
	private Integer numberOfBasement;
	
	@Column(name="direction")
	private String direction;
	
	@Column(name="level")
	private String level;
	
	@Column(name="rentprice")
	private Integer rentPrice;
	
	@Column(name="managername")
	private String managerName;
	
	@Column(name="managerphonenumber")
	private String managerPhoneNumber;
	
	
	@Column(name="servicefee")
	private String serviceFee;
	
	@ManyToOne
	@JoinColumn(name="districtid")
	private DistrictEntity district;
	
	@OneToMany(mappedBy = "building",fetch = FetchType.LAZY)
	private List<RentAreaEntity> rentAreas= new ArrayList<>();

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getWard() {
		return ward;
	}

	public String getStreet() {
		return street;
	}

	public Integer getFloorArea() {
		return floorArea;
	}

	public Integer getNumberOfBasement() {
		return numberOfBasement;
	}

	public String getDirection() {
		return direction;
	}

	public String getLevel() {
		return level;
	}

	public Integer getRentPrice() {
		return rentPrice;
	}

	public String getManagerName() {
		return managerName;
	}

	public String getManagerPhoneNumber() {
		return managerPhoneNumber;
	}

	public String getServiceFee() {
		return serviceFee;
	}

	public DistrictEntity getDistrictId() {
		return district;
	}

	public List<RentAreaEntity> getRentAreas() {
		return rentAreas;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setWard(String ward) {
		this.ward = ward;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setFloorArea(Integer floorArea) {
		this.floorArea = floorArea;
	}

	public void setNumberOfBasement(Integer numberOfBasement) {
		this.numberOfBasement = numberOfBasement;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public void setRentPrice(Integer rentPrice) {
		this.rentPrice = rentPrice;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public void setManagerPhoneNumber(String managerPhoneNumber) {
		this.managerPhoneNumber = managerPhoneNumber;
	}

	public void setServiceFee(String serviceFee) {
		this.serviceFee = serviceFee;
	}

	public void setDistrictId(DistrictEntity districtId) {
		this.district = districtId;
	}

	public void setRentAreas(List<RentAreaEntity> rentAreas) {
		this.rentAreas = rentAreas;
	}
	
	
	
	

	
}

