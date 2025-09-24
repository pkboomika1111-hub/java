package com.p1;

public class swapnum {

	public static void main(String[] args) {
		int x=10,y=5;
		System.out.println("value of x before swapping="+x);
		System.out.println("value of y before swapping="+y);
		x=x^y;
		y=x^y;
		x=x^y;
		System.out.println("value of x after swapping="+x);
		System.out.println("\n value of y after swapping="+y);
		
	}

}
