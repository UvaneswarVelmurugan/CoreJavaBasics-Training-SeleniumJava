package com.ClassesAndObjects;

public class EncapsulatedKid {
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = (name.length() == 0)?"No name":name;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = (age > 1&& age<13)? age:2;
	}
	private String name;
	private int age;
	
	public void play() {
		System.out.println(this.name);

	}

}
