package com.Entity;

import javax.persistence.Entity;

@Entity
public class Footballer extends Player {
    private int goal;
    private String ftype;

	public Footballer(int id, String name, int goal, String ftype) {
		super(id, name);
		this.goal = goal;
		this.ftype = ftype;
	}
	public Footballer() {
		super();
	}
	public int getGoal() {
		return goal;
	}
	public void setGoal(int goal) {
		this.goal = goal;
	}
	public String getFtype() {
		return ftype;
	}
	public void setFtype(String ftype) {
		this.ftype = ftype;
	}
    
    
}
