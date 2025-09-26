package com.p1;

public class perfectnumber {

	public static void main(String[] args) {
	int n=6,sum=0;
	int i=1;
	while(i<=3){
		if(n%i==0){
			sum+=i;
		}
		i++;
	}
		if(sum==n){
			System.out.println("Perfect number");
		}
		else{
			System.out.println("not a Perfect number");
		}
	}

	}