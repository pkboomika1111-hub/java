package com.p1;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.String;
public class collection {
	public static void main(String[] args) {
	ArrayList<Integer> alist=new ArrayList<Integer>();
    alist.add(1);
    alist.add(2);
     for(int i=1;i<=10;i++)
    	 alist.add(i);
    	 System.out.println(alist);
   ArrayList list=new ArrayList();
   list.add("ram");
   list.add(25);
   list.add(99.5);
   for(Object ob:list){
	  String name=(String)ob;
	  System.out.println(name);
   }
}
}