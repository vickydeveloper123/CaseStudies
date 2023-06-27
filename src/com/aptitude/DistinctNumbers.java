package com.aptitude;

import java.util.Scanner;

public class DistinctNumbers {
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int[] array=new int[10];
		
		System.out.println("Please eneter the numbers to fetch distinct numbers==:>");
		
		
		for(int i=0;i<=array.length;i++) 

			 array[i]=scanner.nextInt();
		distinctMethod(array);
		
	
		
		
	}
	
	public static void distinctMethod(int []arr) {

		for(int i=0;i<arr.length;i++) {
			 int j;
			for( j=0;j<i;j++)
			
				if(arr[i]==arr[j])
					break;
			
			if(i==j)
				System.out.println(arr[i]+" ");
			
		}
	}

}
