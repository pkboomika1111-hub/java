package com.p1;

public class oddeven {

	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6,7};
		int even=0,odd=0;
		for(int num:arr){
			if(num%2==0)
				even++;
			else
				odd++;
		}
		System.out.println("even count=" +even);
		System.out.println("odd count=" +odd);
	}
	

}
