package com.p1;
class mathoperation {
static int multiply(int a,int b){
	return a*b;
}
static double multiply(double x,double y)
{
	return x*y;
}
static int multiply(int r){
	return r*r;
}
}
class methodoverloading{
	public static void main(String[] args) {
		System.out.println("\n multi of 2 integers="+mathoperation.multiply(25,10));
		System.out.println("\n multi of 2 float="+mathoperation.multiply(2.5357,8.5786));
		System.out.println("\n multi of same integer value="+mathoperation.multiply(6));
		
		
}
		
	}

