package com.p1;
class cycle{
	public void display(){
		System.out.println("i am a cycle");
	}
}
public class Anonymous {
    public static void main(String[] args) {
	cycle c =new cycle(){
		public void display(){
			System.out.println("i am a tricycle");
		}
	};
   c.display();
}
}