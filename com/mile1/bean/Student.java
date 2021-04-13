package com.mile1.bean;

import java.util.Arrays;

public class Student {
	
	private String name;
	private int marks[];
	
	public Student() {
		super();
	}

	public Student(String name, int[] marks) {
		super();
		this.name = name;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + Arrays.toString(marks) + "]";
	}
	
	
	
	

}
