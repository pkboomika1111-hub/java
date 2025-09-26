package com.p1;

class rcb {
			private int minimumbalance=2500;
			public void  setminimumbalance(int value){
	  this.minimumbalance=value;
	  System.out.println(minimumbalance);
			}
}
		class setter{
			public static void main(String[] args) {
		rcb bb=new rcb();
				bb.setminimumbalance(10000);
			}

		}


