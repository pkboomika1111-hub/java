package com.p1;

public class wheelers {

	public static void main(String[] args) {
	int v=200;
	int w=540;
	int fourwheeler=(w-2*v)/2;
	int twowheeler=(v-fourwheeler);
	System.out.println("no.of two wheelers:"+twowheeler);
	System.out.println("no.of four wheelers:"+fourwheeler);
	}

}
