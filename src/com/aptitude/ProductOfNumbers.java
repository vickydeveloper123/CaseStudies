package com.aptitude;

import java.util.Scanner;

public class ProductOfNumbers {

	public static void main(String[] args) {
		System.out.println("Product Of Numbers");

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter ur Number");
		int i=scanner.nextInt();

		int number = 5, factorial = 1; //

	for(i=1;i<=number;i++)	{
		System.out.println(i);
		
		factorial=factorial*i;
		
			
			 
		}
	
	System.out.println("Product Of Number==>"+factorial);

	}
}
