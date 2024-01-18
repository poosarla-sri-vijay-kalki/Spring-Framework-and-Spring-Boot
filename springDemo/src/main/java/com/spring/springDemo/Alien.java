package com.spring.springDemo;

public class Alien {
	private int age;
	private Computer com;
	public Alien() {
		System.out.println("alien object created");
	}
//	public Alien(int age, int dup) {
//		this.age = age;
//		System.out.println("age = "+age);
//		System.out.println("dup ="+dup);
//	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
		System.out.println("age is set");
	}

	public Computer getCom() {
		return com;
	}
	public void setCom(Computer com) {
		this.com = com;
	}
	public void code() {
		System.out.println("hello");
		com.compile();
	}
}
