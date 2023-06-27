package com.aptitude;

public class Swapping {
	public static void main(String[] args) {
		
		
		float a=(float) 23.05,b=(float) 45.05;
		
		if(a!=0 && b!=0) {
			
			a=a+b; // 68
			b=a-b; //   23 
			a=a-b;  // 
			
			System.out.println("Swapping TWO FLOATING PONT NUMBERS"+a+" "+b);
		}
		
	}

}
