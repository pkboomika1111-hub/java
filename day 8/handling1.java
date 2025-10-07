package com.p1;

public class handling1 {
		public static void main(String[] args) {
				int a=10,b=0;
				int c;
				try{
				 c=a/b;
				}
				catch(ArithmeticException e){
					System.out.println("error occured");
				}
				
				System.out.println("end of program");

			}

		}

