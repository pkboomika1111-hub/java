package com.p1;
class bot implements Runnable{
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
public class interthread {
	 public static void main(String args[])throws InterruptedException{
		 Runnable b=new bot();
		 Thread a=new Thread(b);
		 a.start();
		 pen1 p1=new pen1();
		 p1.start();
		 System.out.println("i am working by main thread");
	 }
}
