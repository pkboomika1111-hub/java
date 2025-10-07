package com.p1;
public class handling2 {
public static void main(String[] args) {
	try{
		int arr[]=null;
		System.out.println(arr[1]);
	}
	catch(ArithmeticException e){
		System.out.println("error");
	}
	catch(NullPointerException e){
		System.out.println("NullPointer Exception");
	}
	System.out.println("end of program");
	}

  {
	System.out.println("executed all");
}
}