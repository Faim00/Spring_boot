package com.map;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Answar {
	
	@Id
	private int anware_id;
	private String answer;
	@OneToOne
	private Question q;
	public Question getQ() {
		return q;
	}

	public void setQ(Question q) {
		this.q = q;
	}

	public Answar() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Answar(int anware_id, String answer) {
		super();
		this.anware_id = anware_id;
		this.answer = answer;
	}
	public int getAnware_id() {
		return anware_id;
	}
	public void setAnware_id(int anware_id) {
		this.anware_id = anware_id;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	
}
