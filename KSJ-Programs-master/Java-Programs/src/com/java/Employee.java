package com.java;

public class Employee implements Comparable<Employee> {

	  private Integer id;
	  private String name;
	  private Float salary;
	   static int value;
	  
	  public Employee() {
		super();
	}

	public Employee(Integer id, String name, Float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
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


	public Float getSalary() {
		return salary;
	}


	public void setSalary(Float salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}


	@Override
	public int compareTo(Employee o) {
		
	if(value==1)	
	{
		if(o.getId()> this.getId() )
			 return 1;
		else if(o.getId()< this.getId() )
			return -1; 
	}
	else if(value==2)
		name.compareTo(o.name);

	else if(value==3)
	{
		if(o.getSalary()> this.getSalary())
			 return 1;
		else if(o.getId()< this.getId() )
			return -1; 
	}
	
	 return name.compareTo(o.name);
	}
	  
}
