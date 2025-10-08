package com.p1;
class pen extends Thread{
	public void run(){
		try{
			for(int i=0;i<=5;i++){
				Thread.sleep(2000);
				System.out.println("updated database");
			 }
		}
		catch(InterruptedException e){}
	}
}
class pen1 extends Thread{
	public void run(){
		try{
			for(int i=1;i<=5;i++){
				Thread.sleep(2000);
				System.out.println(i);
			 }
		}
		catch(InterruptedException e){}
	}
}
 public class multithread {
   public static void main(String args[])throws InterruptedException{
		pen p=new pen();
		p.start();
		pen1 p1=new pen1();
		p1.start();
		p.join();
		p1.join();
		System.out.println("I am working by main Thread..");
	}
 }
