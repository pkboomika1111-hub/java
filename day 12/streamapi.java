package com.p1;
import java.util.Arrays;
public class streamapi {
	public static void main(String[] args) {
		int arr[]={10,5,7,3,6};
		Arrays.stream(arr).sorted().forEach(System.out::println);
	}
}