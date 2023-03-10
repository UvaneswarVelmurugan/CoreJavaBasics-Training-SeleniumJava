package ControlFlowStatements;

import java.util.Scanner;

public class WhileLoopSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int  num,sum=0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Number: ");
		
		num=input.nextInt();
		while(num>=0) {
			sum+=num;
			
			System.out.println("Enter a number: ");
			num=input.nextInt();
		}
		System.out.println("Enter sum of the numbers is: "+sum);
		input.close();

	}

}
