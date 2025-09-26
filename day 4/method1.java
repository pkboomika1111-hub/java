package com.p1;
 class demo {
	public void add(){
		int a=123;
		int b=10;
		System.out.println("addition="+(a+b));
	}
}
class method1{
	public static void main(String[] args) {
		demo o=new demo();
		o.add();
	}

}
