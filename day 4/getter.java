package com.p1;

 class acco {
		private int minimumbalance=2500;
		public int getminimumbalance(){
			return minimumbalance;
	}
}
	class getter{
		public static void main(String[] args) {
			acco bb=new acco();
			int min=bb.getminimumbalance();
			System.out.println(min);

		}

	}

