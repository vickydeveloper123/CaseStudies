package com.aptitude;

import java.util.Scanner;

public class FactoialOfNumber {
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter to find product Of Numbers ====>");
		int num=scanner.nextInt();
		
		int i=1;
		int factorial =1;
		
		while(i<=num) {
			
			factorial=factorial*i;
			i++;
			
			System.out.println(factorial);
			
		}
		
		
		
		
	}

}
