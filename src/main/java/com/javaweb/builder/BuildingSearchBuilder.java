package com.javaweb.builder;

public class BuildingSearchBuilder {
	private String name;
	private Integer floorarea;
	private Integer districtid;
	private String ward;
	private String street;
	private Integer numberofbasement;
	private String direction;
	private String level;
	private Integer startArea;
	private Integer endArea;
	private Integer startRentPrice;
	private Integer endRentPrice;
	private String managername;
	private String managerphonenumber;
	private Integer staffid;
	private Integer rentArea;
	
	private BuildingSearchBuilder(Builder builder) {
		this.name=builder.name;
		this.floorarea=builder.floorarea;
		this.districtid=builder.districtid;
		this.ward=builder.ward;
		this.street=builder.street;
		this.numberofbasement=builder.numberofbasement;
		this.direction=builder.direction;
		this.level=builder.level;
		this.startArea=builder.startArea;
		this.endArea=builder.endArea;
		this.startRentPrice=builder.startRentPrice;
		this.endRentPrice=builder.endRentPrice;
		this.managername=builder.managername;
		this.managerphonenumber=builder.managerphonenumber;
		this.staffid=builder.staffid;
		this.rentArea=builder.rentArea;
	}
	
	public String getName() {
		return name;
	}
	public Integer getFloorarea() {
		return floorarea;
	}
	public Integer getDistrictid() {
		return districtid;
	}
	public String getWard() {
		return ward;
	}
	public String getStreet() {
		return street;
	}
	public Integer getNumberofbasement() {
		return numberofbasement;
	}
	public String getDirection() {
		return direction;
	}
	public String getLevel() {
		return level;
	}
	public Integer getStartArea() {
		return startArea;
	}
	public Integer getEndArea() {
		return endArea;
	}
	public Integer getStartRentPrice() {
		return startRentPrice;
	}
	public Integer getEndRentPrice() {
		return endRentPrice;
	}
	public String getManagername() {
		return managername;
	}
	public String getManagerphonenumber() {
		return managerphonenumber;
	}
	public Integer getStaffid() {
		return staffid;
	}
	public Integer getRentArea() {
		return rentArea;
	}
	public static class Builder {
		private String name;
		private Integer floorarea;
		private Integer districtid;
		private String ward;
		private String street;
		private Integer numberofbasement;
		private String direction;
		private String level;
		private Integer startArea;
		private Integer endArea;
		private Integer startRentPrice;
		private Integer endRentPrice;
		private String managername;
		private String managerphonenumber;
		private Integer staffid;
		private Integer rentArea;
		public Builder setName(String name) {
			this.name = name;
			return this;
		}
		public Builder setFloorarea(Integer floorarea) {
			this.floorarea = floorarea;
			return this;
		}
		public Builder setDistrictid(Integer districtid) {
			this.districtid = districtid;
			return this;
		}
		public Builder setWard(String ward) {
			this.ward = ward;
			return this;
		}
		public Builder setStreet(String street) {
			this.street = street;
			return this;
		}
		public Builder setNumberofbasement(Integer numberofbasement) {
			this.numberofbasement = numberofbasement;
			return this;
		}
		public Builder setDirection(String direction) {
			this.direction = direction;
			return this;
		}
		public Builder setLevel(String level) {
			this.level = level;
			return this;
		}
		public Builder setStartArea(Integer startArea) {
			this.startArea = startArea;
			return this;
		}
		public Builder setEndArea(Integer endArea) {
			this.endArea = endArea;
			return this;
		}
		public Builder setStartRentPrice(Integer startRentPrice) {
			this.startRentPrice = startRentPrice;
			return this;
		}
		public Builder setEndRentPrice(Integer endRentPrice) {
			this.endRentPrice = endRentPrice;
			return this;
		}
		public Builder setManagername(String managername) {
			this.managername = managername;
			return this;
		}
		public Builder setManagerphonenumber(String managerphonenumber) {
			this.managerphonenumber = managerphonenumber;
			return this;
		}
		public Builder setStaffid(Integer staffid) {
			this.staffid = staffid;
			return this;
		}
		public Builder setRentArea(Integer rentArea) {
			this.rentArea = rentArea;
			return this;
		}
		public BuildingSearchBuilder build() {
			return new BuildingSearchBuilder(this);
		}
	}	
}
