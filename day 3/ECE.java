class student{
		int id;
		String name;
		void display()
		{
			System.out.println("ID:"+id);
			System.out.println("Name:"+name);
		}
	}
class ECE{
	public static void main(String[] args)
{
			student ram=new student();
			ram.id=101;
			ram.name="Ram kumar";
			ram.display();
}
}