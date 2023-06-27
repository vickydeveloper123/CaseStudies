package com.javaPrograms.pvrSir;

public class FactorsOfGivenNumber {
	
	public static void main(String[] args) {
		
		int number=10,factor;
		
		for(int i=1;i<=number;i++) {
			
			if(number%i==0) 
				System.out.println("Factors Are==>"+i);
			
			else
				System.out.println(+i+"====>"+"NOT A FACTOR==>");
		}
		
	}

}
