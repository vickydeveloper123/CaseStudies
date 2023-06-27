package com.aptitude.patterns.sumittiwari;

import java.util.Scanner;

public class pattern1 {

	 public static void printStars(int n)
	    {
	        int i, j;
	 
	        for(i=0;i<=n;i++) {
	        	for(j=0;j<=i;j++) {
	        		System.out.println("*");
	        	}
	        	System.out.println( );
	        }
	       
	       
	   }
	 
	    // Driver Function
	    public static void main(String args[])
	    {
	    	Scanner scanner=new Scanner(System.in);
	    	System.out.println("Enter the number of rows");
	    	int n=scanner.nextInt();
	        printStars(n);
	    }
}