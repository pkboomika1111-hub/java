package compile1;
@ FunctionalInterface
interface Contract
{
	public void rule1(int a,int b);
	public static void rule2(){
}
	public default void rule3(){}
}
public class lambda {
	public static void main(String[] args) {
		Contract ci=(a,b)->{System.out.println(a+b);};
		ci.rule1(2,3);

	}

}
