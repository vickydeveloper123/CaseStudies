package com.casestudy6;

public class LeftTriangle {
	public static void main(String[] args) {
		
		int size=5;
		
		int Alpha=65;
		
		
		for(int i=0;i<size;i++) {
			for(int j=0;j<i;j++)
			{
				System.out.print((char)(Alpha+j));
			}
			
			System.out.println();
		}
		
	}

}
