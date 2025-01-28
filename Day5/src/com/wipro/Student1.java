package com.wipro;

public class Student1 {
	int id;
	String name;
	String dept;
	public Student1(int id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	public Object getDept() {
		// TODO Auto-generated method stub
		return dept;
	}
	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}
	
	

}
