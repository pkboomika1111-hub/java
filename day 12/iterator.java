package com.p1;
import java.util.ArrayList;
import java.util.Iterator;
public class iterator {
	public static void main(String[] args){ 
		ArrayList<Integer> alist=new ArrayList<Integer>();
	    alist.add(1);
	    alist.add(2);
	     for(int i=1;i<=10;i++)
	    	 alist.add(i);
	    	 System.out.println(alist);
		  Iterator<Integer> i=alist.iterator();
		   System.out.println("using iterator");
		   System.out.println(i.next());
		   while(i.hasNext()){
				  System.out.println(i.next());
			  }
		   ArrayList<String> list=new ArrayList<String>();
		    list.add("honey");
		    list.add("joes");
		    ArrayList<String> list2=new ArrayList<String>();
		    list2.addAll(list);
		    System.out.println(list);
	}
}
