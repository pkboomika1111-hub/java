package com.p1;

import java.util.Arrays;

public class copy {

	public static void main(String[] args)
	{
		int[] a={1,2,3,4,5};
		int[]copy=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			copy[i]=a[i];
		}
		System.out.println(Arrays.toString(copy));
			
		}
		
		

}
