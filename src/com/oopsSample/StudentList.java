package com.oopsSample;

import java.util.ArrayList;

public class StudentList {
	ArrayList<Student> studList;
	public StudentList() {
		System.out.println("Creating student list.. ");
		studList = new ArrayList<>();
	}

	public void addStudent(Student student) {
		System.out.println("Add students to list.. ");
		studList.add(student);

		// TODO Auto-generated method stub

	}
	public ArrayList getStudents() {
		return studList;
	}

}
