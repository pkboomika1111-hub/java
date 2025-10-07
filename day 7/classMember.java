package com.p1;
abstract  class Member {
abstract void welcomemsg();
void display(){
 System.out.println("welcome all");
}
}
class student extends Member{
	void  welcomemsg(){
		System.out.println("hello teacher");
	}
}
 public class classMember{
	public static void main(String args[])
	{
		student s1=new student();
		s1.display();
		s1.welcomemsg();
	}

}
