package com.aptitude;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AcceptANumberAddingALLdigits {
	
	public static void main(String[] args) throws Exception{
		
		int r=0,s=0,n=0;
		
		BufferedReader ref=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter any Number");
		
		n=Integer.parseInt(ref.readLine());
		
		while(n>0) { // 123           12             1             0>0(False)
			r=n%10;  //  3            2              1
			s=s+r;   //  0+3=3        3+2=5          5+1=6
			n=n/10;  //  12           1              1/10=0
			
		}
		System.out.println(s);
		
		
	}

}
