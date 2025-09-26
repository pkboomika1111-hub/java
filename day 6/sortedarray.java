package com.p1;
import java.util.Scanner;
public class sortedarray {

	public static void main(String[] args) {
		int arr[]=new int[100];
		int size;
		int asc=1,des=1;
		System.out.println("enter the size:");
		Scanner s=new Scanner(System.in);
		size=s.nextInt();
		System.out.println("enter the array values");
		for(int i=0;i<size;i++){
			arr[i]=s.nextInt();
		}
		for(int i=0;i<size-1;i++){
			if(arr[i]>arr[i+1])
			{
			      asc=0;
			}
				else if(arr[i]<arr[i+1]){
					des=0;
				}
				if(asc==0 && des==0){
					System.out.println("not sorted");
					}
				else {
					System.out.println(" sorted");
				}
			}
		
		
	}

}
