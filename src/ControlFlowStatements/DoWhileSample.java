package ControlFlowStatements;

import java.util.Scanner;

public class DoWhileSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,sum=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number: ");
		
		num=input.nextInt();
		do {
			sum +=num;
			System.out.println("Enter a number: ");
			num = input.nextInt();
		   }
		while(num>=0);
		System.out.println("Enter Sum of a numbers is: "+sum);
		input.close();

	}

}
