package com.p1;
import java.util.ArrayList;
import java.util.Collections;
public class collectionsort {
	public static void main(String[] args) {
		ArrayList<Integer> alist=new ArrayList<Integer>();
		 for(int i=1;i<=10;i++){
	    	 alist.add(i);
		 }
		alist.add(1);
		alist.add(2);
		alist.add(3);
		alist.add(4);
		alist.add(5);
		Collections.sort(alist);
		System.out.println(alist);
	
	ArrayList<String> fruits=new ArrayList<String>();
	fruits.add("Apple");
	fruits.add("Banana");
	fruits.add("Mango");
	System.out.println("first element:"+fruits.get(0));
	System.out.println("second element:"+fruits.get(1));
	System.out.println("third element:"+fruits.get(2));
	Collections.sort(fruits);
	System.out.println("sorted list:"+fruits);
	Collections.reverse(fruits);
	System.out.println("reversed list:"+fruits);
}
}