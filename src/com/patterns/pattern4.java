package com.patterns;

public class pattern4 {
	
	
//	  1
//	  1  3  5
//	  1  3  5  7  9
//	  1  3  5  7  9  11  13
	
	public static void main(String[] args) {
		for(int a=1;a<=13;a=a+4) {
			System.out.println();
			for(int b=1;b<=a;b=b+2) {
				System.out.print(" * "+b);
			}
		}
	}

}
