package com.p1;
public class blocks {
static{
	System.out.println("I will run before the JVM loads the main class");
}
	static int count=0;
	{
		System.out.println("i will run for each object creation");
		count++;
	}
	public static void main(String[] args) {
	 blocks e=new blocks();
		blocks e1=new blocks();
		System.out.println("count="+count);
	}

}
