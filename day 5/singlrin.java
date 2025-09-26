class fath{
	void house(){
		System.out.println("have own 2bhk house");
	}
}
class on extends fath{
	void car(){
		System.out.println("have own audi car");
	}
}
     class singlrin {

	public static void main(String[] args) {
		on o=new on();
		o.house();
		o.car();

	}

}
