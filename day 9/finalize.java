package com.p1;

public class finalize {
public void finaliz(){
	System.out.println("finalize method called before object is destroyed");
}
	public static void main(String[] args) {
		finalize object=new finalize();
		object=null;
		System.gc();
		System.out.println("main method execution..");
	}

}
