package com.Entity;

import javax.persistence.Entity;

@Entity
public class Cricketer extends Player {
	private int goal;
	private String ctype;
	
	public Cricketer(int id, String name, int goal, String ctype) {
		super(id, name);
		this.goal = goal;
		this.ctype = ctype;
	}
	public int getGoal() {
		return goal;
	}
	public void setGoal(int goal) {
		this.goal = goal;
	}
	public String getCtype() {
		return ctype;
	}
	public void setCtype(String ctype) {
		this.ctype = ctype;
	}
	@Override
	public String toString() {
		return "Cricketer [goal=" + goal + ", ctype=" + ctype + "]";
	}
	public Cricketer() {
		super();
	}
	
	

}
