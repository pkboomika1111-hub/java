package com.p1;
import java.util.ArrayList;
public class commonarraylist {
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
	    a.add(1);
	    a.add(2);
	    a.add(3);
	    ArrayList<Integer> b=new ArrayList<Integer>();
	    b.add(4);
	    b.add(5);
	    b.add(2);
	    a.retainAll(b);
	    System.out.println(a);
	}
	}


