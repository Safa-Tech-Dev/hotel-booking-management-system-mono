package com.devcrush.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STATE")
public class State {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
//	@Column(name = "state_id")
	private int id;
	@Column(name = "state_name")
	private String name;
	public State() {
		super();
		// TODO Auto-generated constructor stub
	}
	public State(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	@Override
	public String toString() {
		return "State [id=" + id + ", name=" + name + "]";
	}
	
	

}
