package com.p1;
import java.util.Scanner;
public class menucard {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Coffee       Rs:15");
		System.out.println("2.Tea          Rs:10");
		System.out.println("3.Cold Coffee  Rs:25");
		System.out.println("4.Milk Shake   Rs:50");
		System.out.println("Enter your choice:");
		int choice=sc.nextInt();
		int price=0;
		String item="";
		switch(choice){
		case 1:
			price=15;
			item="Coffee";
			break;
		case 2:
			price=10;
			item="Tea";
			break;
		case 3:
			price=25;
			item="Cold Coffee";
			break;
		case 4:
			price=50;
			item="Milk Shake";
			break;
			default:
				System.out.println("Invalid choice");
				return;
		}
		System.out.println("Enter quantity:");
		int quantity=sc.nextInt();
		int Total=price*quantity;
		System.out.println("you have selected="+item);
		System.out.println("Total amount="+Total);
		
	}

}
