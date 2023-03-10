package com.oopsSample;

import java.util.ArrayList;

public class StudentDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new PayingStudent("Atman",9.5f);
		s1.goToClass();
		
		Student s2 = new CompanyStudent("Man","Zuci");
		s2.goToClass();
		
		Student s3 = new PayingStudent("Arun",8.7f);
		Student s4 = new CompanyStudent("Aroon","Zuci Systems");
		Student s5 = new AduitStudent("Bala","Zuci Systems");
		StudentList students = new StudentList();
		students.addStudent(s1);
		students.addStudent(s2);
		students.addStudent(s3);
		students.addStudent(s4);
		students.addStudent(s5);
		System.out.println("Object of s5 is.. "+s5.toString());
		System.out.println("Object of s4 is.. "+s4.toString());
		System.out.println("Object of s3 is.. "+s3.toString());
		
		ArrayList<Student> studs = students.getStudents();
		for(Student stud:studs) {
			stud.goToClass();
		}

	}

}
