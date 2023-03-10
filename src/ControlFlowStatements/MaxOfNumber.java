package ControlFlowStatements;

public class MaxOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=5,n2=1,n3=8;
		if((n1>n2)&&(n1>n3))
		{
			System.out.println("The large no is : "+n1);
		}
		else if((n2>n1)&&(n2>n3))
		{
			System.out.println("The large no is : "+n2);
		}
		else if((n3>n1)&&(n3>n2))
		{
			System.out.println("The large no is : "+n3);
		}

	}

}
