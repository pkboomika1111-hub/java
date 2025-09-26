package com.p1;
class moo {
	public int mul(){
		int a=123;
		int b=10;
		return a*b;
	}
}
class method3{
	public static void main(String[] args) {
		moo o=new moo();
		int x=o.mul();
		System.out.print(x);
	}

}
