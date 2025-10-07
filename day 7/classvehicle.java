package com.p1;
public class classvehicle {
final void run(){
	System.out.println("vehicle is running..");
}
}
class bike extends classvehicle{
	final void running()
	{
		System.out.println("bike is running...");
	}
}
 class finalmethod{
	public static void main(String[] args) {
bike obj=new bike();
obj.run();
	}

}
