package Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class User {
	
	@Id
	private int user_id;
	private String name;
	@OneToOne
	private Address add;
	
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int user_id, String name, Address add) {
		super();
		this.user_id = user_id;
		this.name = name;
		this.add = add;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	
	
}
