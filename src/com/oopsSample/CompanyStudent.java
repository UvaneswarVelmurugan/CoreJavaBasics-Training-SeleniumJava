package com.oopsSample;

public class CompanyStudent extends Student {
	String companyName;
	public CompanyStudent(String name, String companyName) {
		this.name = name;
		this.companyName = companyName;
	}

	public void goToClass() {
		System.out.println("Go to class after evalu.. "+this.name);
		// TODO Auto-generated method stub

	}
	public String toString() {
		String str = "Company student name is "+this.name;
		return str;
	}

}
