package com.p1;
import java.util.Scanner;
public class vowels {
public static void main(String[]args){

   Scanner sc=new Scanner(System.in);
   System.out.print("enter a string :");
String str=sc.nextLine();
int count=0;
for(int i=0;i<str.length();i++){
	char ch=Character.toLowerCase(str.charAt(i));
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
	count++;
}
}
System.out.println("number of vowels:"+count);
}
}