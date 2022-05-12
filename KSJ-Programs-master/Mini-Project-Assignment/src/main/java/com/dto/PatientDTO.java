package com.dto;

import java.io.Serializable;

public class PatientDTO implements Serializable {
 
	  private Integer id;
	  private String name;
	  private String address;
	  private Double perDayCharge;
	  private Integer totalDay;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Double getPerDayCharge() {
		return perDayCharge;
	}
	public void setPerDayCharge(Double perDayCharge) {
		this.perDayCharge = perDayCharge;
	}
	public Integer getTotalDay() {
		return totalDay;
	}
	public void setTotalDay(Integer totalDay) {
		this.totalDay = totalDay;
	}
	 
}
