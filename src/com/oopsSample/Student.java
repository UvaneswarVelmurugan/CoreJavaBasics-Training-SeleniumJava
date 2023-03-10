package com.oopsSample;

public abstract class Student {
	
	String name;
	String address;
	Float gpa;
	
	public Student(String name) {
		this.name = name;
	}
	/*public Student(float gpa) {
	 * this.name = name;
	 * this.gpa=gpa;
	 }*/
	public Student() {
		
	}

	public void goToClass() {
		System.out.println("Student go to classes "+ this.name);
		// TODO Auto-generated method stub

	}
	//public abstract void goToClass();

}
