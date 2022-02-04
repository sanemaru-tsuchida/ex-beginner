package com.example.domain;

public class Exam1 {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Department[name="+name+"]";
	}
}
