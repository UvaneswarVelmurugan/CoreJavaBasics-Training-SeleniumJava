package ControlFlowStatements;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=2;
		int y=2000;
		int d=0;
		switch(m) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			d=31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			d=30;
			break;
		case 2:
			if(((y%4==0)&&!(y%100==0)) || (y%400==0))
				d=29;
			else
				d=28;
			break;
		}
		System.out.println("No of days: "+d);

	}

}
