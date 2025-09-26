package com.p1;
class bank{
	void displaybankname(){
		System.out.println("welcome to SBI");
	}
}
class savingsaccount extends bank{
	void savingsfeatures(){
		System.out.println("daily transaction allowed");
	}
}
class currentaccount extends bank{
	void currentfeatures(){
		System.out.println("low interest rate");
	}
}
    class hierarchy {

	public static void main(String[] args) {
		savingsaccount s=new savingsaccount();
		s.displaybankname();
		s.savingsfeatures();
		currentaccount c=new currentaccount();
		c.displaybankname();
		c.currentfeatures();
		
	}

}
