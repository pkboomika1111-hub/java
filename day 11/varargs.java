package compile1;

public class varargs {
 static int minvalue(int...vals){
	 int min=Integer.MAX_VALUE;
	 for(int k:vals){
		 if(k<min){
			 min=k;
		 }
	 }
	 return min;
 }
	public static void main(String[] args) {
		int m=minvalue(8,7,6,3,4);
		System.out.println(m);
	}

}
