package com.bo;

public class PatientBO {

	  private Integer id;
	  private String name;
	  private String address;
	  private Double perDayCharge;
	  private Integer totalDay;
	  private Double billAmt;
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
	public Double getBillAmt() {
		return billAmt;
	}
	public void setBillAmt(Double billAmt) {
		this.billAmt = billAmt;
	}
	  
	  
}
