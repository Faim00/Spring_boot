package entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Charger {
	
	@Id
	private int c_id;
	private String c_Name;
	
	@ManyToMany(mappedBy="chargers")
	private List<Mobiles> mobiles;

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public String getC_Name() {
		return c_Name;
	}

	public void setC_Name(String c_Name) {
		this.c_Name = c_Name;
	}

	public List<Mobiles> getMobiles() {
		return mobiles;
	}

	public void setMobiles(List<Mobiles> mobiles) {
		this.mobiles = mobiles;
	}
	
}
