package com.p1;

public class maxarray {

	public static void main(String[] args) {
		int arr[]={20,60,10,30};
		int max =arr[0];
		for(int num:arr){
			if(num>max)
				max=num;
		}
		System.out.println("maximum=" +max);
		}

}
