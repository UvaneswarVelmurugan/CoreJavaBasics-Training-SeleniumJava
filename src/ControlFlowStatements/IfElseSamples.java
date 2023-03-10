package ControlFlowStatements;

public class IfElseSamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sc=76;
		char grade;
		if(sc>=90)
		{
			grade='A';
		}
		else if(sc>=80)
		{
			grade='B';
		}
		else if(sc>=70)
		{
			grade='C';
		}
		else {
			grade='E';
		}
		System.out.println("Grade : "+grade);

	}

}
