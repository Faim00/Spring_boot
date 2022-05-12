package entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Mobiles {

	@Id
	private int m_id;
	private String m_Name;

	@ManyToMany
	private List<Charger> chargers;

	public int getM_id() {
		return m_id;
	}

	public void setM_id(int m_id) {
		this.m_id = m_id;
	}

	public String getM_Name() {
		return m_Name;
	}

	public void setM_Name(String m_Name) {
		this.m_Name = m_Name;
	}

	public List<Charger> getChargers() {
		return chargers;
	}

	public void setChargers(List<Charger> chargers) {
		this.chargers = chargers;
	}
   
	
}
