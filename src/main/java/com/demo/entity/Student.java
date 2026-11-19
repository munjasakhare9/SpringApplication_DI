package com.demo.entity;

public class Student {
	private int id;
	private String name;
	private String city;
	private double percentage;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, String city, double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", percentage=" + percentage + "]";
	}

}
