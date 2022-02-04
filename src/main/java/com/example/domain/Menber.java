package com.example.domain;

public class Menber {
	private Integer id;
	private String name;
	private Integer age;
	private String depId;
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Integer getAge() {
		return age;
	}
	public String getDepId() {
		return depId;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public void setDepId(String depId) {
		this.depId = depId;
	}
	public String toString() {
		return name;
	}
}
