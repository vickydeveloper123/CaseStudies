package com.casestudy6;

import java.util.Scanner;

public class Pattern2 {
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter the Number of rows to print the Pattern");
		int rows=scanner.nextInt();
		
		System.out.println("**************Here is your Pattern**********");
		
		for(int i=0;i<=rows;i++) {
			
			int num;
			
			if(i%2==0) {
				num=1;
				
				for(int j=1;j<=rows;j++) {
					System.out.print(num);
					
					num =(num==0)? 1 : 0;
					
				
				}
			}
			
			else
				 {
					num=0;
					
					for(int j=1;j<=rows;j++) {
						System.out.print(num);
						
						num =(num==0)? 1 : 0;
						
					
					}
				}
			
			System.out.println();
			
		}
		
		scanner.close();
		
		
		
		
	}

}
