package com.basicSamples;

public class RelationalOpSample {

	public static void main(String[] args) {
		int a = 7, b = 11;
		System.out.println("a is " + a + " and b is" +b);
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a >= b);
		System.out.println(a <= b);
		System.out.println((5 > 3) && (8 > 5));
		System.out.println((5 > 3) && (8 < 5));
		System.out.println((5 < 3) && (8 > 5));
		System.out.println((5 > 3) && (8 < 5));
		System.out.println((5 < 3) && (8 < 5));
		System.out.println(!(5 == 3));
		System.out.println(!(5 < 3));

	}

}
