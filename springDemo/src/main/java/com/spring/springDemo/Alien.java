package com.spring.springDemo;

public class Alien {
	private int age;
	private Laptop lap;
	public Alien() {
		System.out.println("alien object created");
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
		System.out.println("age is set");
	}
	
	public Laptop getLap() {
		return lap;
	}

	public void setLap(Laptop lap) {
		this.lap = lap;
	}

	public void code() {
		System.out.println("hello");
		lap.compile();
	}
}
