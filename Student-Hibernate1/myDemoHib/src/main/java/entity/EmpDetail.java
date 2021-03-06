package entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmpDetail {
	@Id
	private int id;
	private String name;
	private int age;
	private int sall;
	
	public EmpDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public EmpDetail(int id, String name, int age, int sall) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sall = sall;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSall() {
		return sall;
	}
	public void setSall(int sall) {
		this.sall = sall;
	}


	@Override
	public String toString() {
		return "EmpDetail [id=" + id + ", name=" + name + ", age=" + age + ", sall=" + sall + "]";
	}

	
	
}
