package com.casestudy6;

public class Pattern5 {
	
		
		
		 public static void main(String[] args)
		    {
		        int alphabet = 1;
		        
		        System.out.println("** Printing the pattern... **");
		        for (int i = 0; i <= 5; i++)
		        {
		            for (int j = 0; j <= i; j++)
		            {
		                System.out.print((int) (alphabet)+
		                		" " );
		                
		            }
		            
		            alphabet++;
		            System.out.println();
		        }
		    }

}
