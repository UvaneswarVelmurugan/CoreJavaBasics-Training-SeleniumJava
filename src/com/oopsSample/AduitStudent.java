package com.oopsSample;

public class AduitStudent extends Student {
	String name;
	String Location;
	public AduitStudent(String name,String Location) {
		this.name = name;
		this.Location = Location;
	}

	public void goToClass() {
		System.out.println("Go to the specified auditorium no.1... "+this.Location);
		// TODO Auto-generated method stub

	}
	public String toString() {
		String strObj = "Audit student name is "+this.name;
		return strObj;
	}

}
