package com.p1;
class user{
	String name;
	int age;
	user(String n,int a){
		this.name=n;
		this.age=a;
	}
	public void display(){
		System.out.println("name="+name);
		System.out.println("age="+age);
		}
}
class Mainprogrammer extends user{
	String companyname;
	 Mainprogrammer(String n,int a,String c){
		 super(n,a);
		 this.companyname=c;
	 }
	 public void display(){
		 System.out.println("name="+name);
			System.out.println("age="+age);
			System.out.println("companyname="+companyname);
	 }
}
public class overriding {

	public static void main(String[] args) {
		Mainprogrammer o=new Mainprogrammer("Ram",22,"technologies");
		o.display();

	}

}
