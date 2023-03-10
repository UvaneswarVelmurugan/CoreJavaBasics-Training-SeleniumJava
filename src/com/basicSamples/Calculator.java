package com.basicSamples;

public class Calculator {
	int a;
	int b;
	static int c;
	public void add(int a, int b) {
	int sum;
	sum = a+b;
	System.out.println(sum);
	}
	public static void main(String[] args) {
		Calculator caobj = new Calculator();
		caobj.add(3, 2);
	}

}
