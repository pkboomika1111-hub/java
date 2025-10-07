package com.p1;

abstract  class parent {
abstract void repay();
void getloan(){
	System.out.println("getting loan");
}
}
class son extends parent{
	void repay(){
		System.out.println("i will pay on behalf of my father");
	}
}
class classparent{
	public static void main(String[] args) {
		son s=new son();
		s.getloan();
		s.repay();
		
		
		
	}

}
