package com.p1;
interface vehicle{
	void start();
}
interface car extends vehicle{
	void moving();
}
class bmw implements car{
	public void start(){
		System.out.println("car started");
	}
	public void moving(){
		System.out.println("car moving");
	}
}
public class interfaces {
public static void main(String[] args) {
		bmw mycar=new bmw();
		mycar.start();
		mycar.moving();
	}

}
