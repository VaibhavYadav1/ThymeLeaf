package com.bharath.springweb.thymeleaf.model;

public class Student {
	
	private String name;
	private int score;
	private int total_marks;
	private String remark; 
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	public void setTotal_marks(int total_marks) {
		this.total_marks = total_marks;
	}

	public int getTotal_marks() {
		return total_marks;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}

