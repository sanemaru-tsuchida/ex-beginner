package com.example.domain;

public class User {
	private String name;
	private String age;
	private String comment;
	public String getName() {
		return name;
	}
	
	public String getComment() {
		return comment;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
}
