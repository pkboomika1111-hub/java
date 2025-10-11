package compile1;
class table{
	synchronized void printtable(int n)
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				Thread.sleep(1000);
				System.out.println(n*i);
			}
	}
		catch(InterruptedException e){}
	}
}

public class synchronization {

	public static void main(String[] args) {
		table t=new table();
		Thread t1=new Thread()
		{
		public void run()
		{
			t.printtable(2);
		}

	};
	Thread t2=new Thread()
			{
		public void run()
		{
			t.printtable(3);}
		
		};
		t1.start();
		t2.start();
			}

}
