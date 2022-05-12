package Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	private int Ad_id;
	private String address;

	private User user;
	
	
	public Address(int ad_id, String address) {
		super();
		Ad_id = ad_id;
		this.address = address;
	}
	public int getAd_id() {
		return Ad_id;
	}
	public void setAd_id(int ad_id) {
		Ad_id = ad_id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
