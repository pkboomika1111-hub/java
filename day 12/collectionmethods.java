package com.p1;
import java.util.ArrayList;
public class collectionmethods {
	public static void main(String[] args) {
		 ArrayList<String> list=new ArrayList<String>();
		 list.add("ram");
		 list.add("kumar");
	     for(String a:list)
	     {
	    	 System.out.println(a.toUpperCase());
	     }
	     ArrayList<Integer> alist=new ArrayList<Integer>();
	     for(int i=1;i<=10;i++){
	    	 alist.add(i);
	     }
	    	 System.out.println(alist);
	     System.out.println(alist);
	     System.out.println(alist.get(3));
	     alist.set(0,100);
	     System.out.println(alist);
	     alist.remove(5);
	     System.out.println(alist);
	     alist.clear();
	     System.out.println(alist);
}
}
