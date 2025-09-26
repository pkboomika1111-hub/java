package com.p1;
class ratfood{
	static int packets(int r,int unit,int arr[]){
		int foodneed=r*unit;
		int start=0;
		int used=0;
		for(int f:arr){
			start+=f;
			used++;
			if(start>=foodneed){
				return used;
			}
		}
		return-1;
			}

	public static void main(String[] args) {
		int r=7;
		int unit=2;
		int used[]={2,8,3,5,7,4,1,2};
		int result=packets(r,unit,used);
		System.out.print("packets used:"+result);

	}

}
