package com.p1;
import java.util.Scanner;
 class boo{
		public void sub(int x,int y){
			System.out.println("subtraction="+(x-y));
		}
	}
	class method2{
		public static void main(String[] args) {
			boo o=new boo();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a:");
			System.out.println("Enter b:");
			int a=sc.nextInt();
			int b=sc.nextInt();
		    o.sub(a,b);
		}

	}


