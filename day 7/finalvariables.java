package com.p1;
class finalvariables {
final int speedlimit=60;
void display()
{
	//speedlimit=70;
	System.out.println("speedlimit="+speedlimit);
}
	public static void main(String[] args) {
		finalvariables object=new 	finalvariables();
		object.display();

	}

}
