package ControlFlowStatements;

public class LargeEleInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int [] {10,25,100,125,99,560,2,11};
		int max = arr[0];
		for(int i = 0; i< arr.length; i++) {
			if(arr[i] > max)
				max = arr[i];
		}
		System.out.println("Largest in an array: "+max);

	}

}
