package com.p1;

import java.util.Scanner;

public class salary {

	public static void main(String[] args) {
		float basic,hra,da,gross;
		Scanner sc =new Scanner(System.in);
		basic=sc.nextInt();
		hra=basic*0.4f;
		da=basic*0.2f;
		gross=basic+hra+da;
		System.out.println("Gross Salary="+gross);	
}
}
