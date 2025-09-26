package com.p1;
class hoo {
	public float div(int x,int y){
		return(x/y);
	}
}
class method4{
	public static void main(String[] args) {
		hoo o=new hoo();
		System.out.print("Division="+o.div(123, 10));
	}

}
