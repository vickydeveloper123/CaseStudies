package com.aptitude;

import java.util.Scanner;

public class EvenAndOddCount {
	
	public static void main(String[] args) {
		
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Please Enter the Number===");
		
		
		int number=scanner.nextInt();
		
		int remainder,eventCount = 0,OddCount = 0;
		
		while(number>0) {
			remainder=number%10;
			
			if(remainder%2==0) {
				
				eventCount=eventCount+1;
			}
			else {
				OddCount=OddCount+1;
			}
			
			number=number/10;
		}
		System.out.println("EvenCount===>"+eventCount);
		System.out.println("OddCount===>"+OddCount);
		
		
			
			
			
		}
		
	}


