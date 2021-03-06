package com.map;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Question {
	@Id
	private int q_id;
	private String question;
	@OneToOne
	private Answar answare;
	
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Question(int q_id, String question, Answar answare) {
		super();
		this.q_id = q_id;
		this.question = question;
		this.answare = answare;
	}
	public int getQ_id() {
		return q_id;
	}
	public void setQ_id(int q_id) {
		this.q_id = q_id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public Answar getAnsware() {
		return answare;
	}
	public void setAnsware(Answar answare) {
		this.answare = answare;
	}
	

}
