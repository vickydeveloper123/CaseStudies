package com.aptitude;

import java.util.Scanner;

public class SumOfNumbers {
	
	public static void main(String[] args) {
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter the value numbers to count the series in order");
		int i=scanner.nextInt();
		int count=0;
		
		for(i=0;i<=5;i++) {
			count=count+i;
			System.out.println(" Numbers===>"+i);

			System.out.println("Counting Numbers===>"+count);
			
		}
	}

}
