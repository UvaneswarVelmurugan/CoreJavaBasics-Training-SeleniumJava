package IOStream;

import java.util.ArrayList;

import com.oopsSample.AduitStudent;
import com.oopsSample.CompanyStudent;
import com.oopsSample.PayingStudent;
import com.oopsSample.Student;


public class StudentArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student> Stud = new ArrayList<>();
		Student s1 = new PayingStudent("Arun",8.7f);
		Student s2 = new CompanyStudent("Aroon","Zuci");
		Student s3 = new AduitStudent("Arun","Zuci Systems");
		Student s4 = new PayingStudent("Atman", 9.5f);
		Student s5 = new CompanyStudent("Man","Zuci");
		Stud.add(s1);
		Stud.add(s2);
		Stud.add(s3);
		Stud.add(s4);
		
		Stud.add(s5);
		System.out.println("Array List:\n "+Stud);
		Stud.remove(s3);
		System.out.println("After Removal Array List: "+Stud);
		for(Student s:Stud) {
			System.out.println(s);
		}

	}

}
