package com.spring.entity;

public class Student {

	  private Integer id;
	  private String name;
	  private String adddress;
	  
	  
	public Student(Integer id, String name, String adddress) {
		super();
		this.id = id;
		this.name = name;
		this.adddress = adddress;
	}
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
	public String getAdddress() {
		return adddress;
	}
	public void setAdddress(String adddress) {
		this.adddress = adddress;
	}
	  
}
