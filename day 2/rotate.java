package com.p1;

public class rotate
{
	public static void main(String[]args){
		int []a={1,2,3,4,5,6,7};
		int n=a.length;
		int k=2;
		k=k%n;
		System.out.println("array after rotations:");
		for(int i=k;i<n;i++){
			System.out.println(a[i]+"");
			
		}
		for(int i=0;i<k;i++);
		System.out.print(a[1]+"");
		
	}
}

