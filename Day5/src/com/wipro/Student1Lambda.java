package com.wipro;

import java.util.ArrayList;
import java.util.List;

public class Student1Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student1> std=new ArrayList<Student1>();
		std.add(new Student1(1,"Nani","CSE"));
		std.add(new Student1(2,"Jagadeesh","AIML"));
		List<Student1> fresh=std.stream().filter(m->m.getDept().equals("CSE")).toList();
		System.out.println(fresh);
		System.out.println(std);
	}

}
