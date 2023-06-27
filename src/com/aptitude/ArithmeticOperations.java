package com.aptitude;

import java.awt.Choice;
import java.util.Scanner;

public class ArithmeticOperations {
	
		public static void main(String[] args) {
	        int a, b;
	       Scanner s=new Scanner(System.in); 
	       System.out.println("Enter First Number: ");
	       a=Integer.parseInt(s.nextLine());
	       System.out.println("Enter Second Number: ");
	       b=Integer.parseInt(s.nextLine());
	       
	       while(true){
	          System.out.println("Select an Arithmetic  Operation...");
	          System.out.println("1. Add");
	          System.out.println("2. Subtract");
	          System.out.println("3. Multiply");
	          System.out.println("4. Divide");
	          System.out.println("5.Modulus");
	          System.out.println("5. Exit");
	          System.out.println("Type your selection here: ");
	   
	          int choice=s.nextInt();
	          switch(choice){
	              case 1:
	                  System.out.println("Addition Operation = "+(a+b));
	                  break;
	              case 2:
	                  System.out.println("Subraction Operation = "+(a-b));
	                  break;
	              case 3:
	                  System.out.println("Product Operation = "+(a*b));
	                  break;
	              case 4:
	                  System.out.println("Division Operation = "+(a/b));
	                  break;
	                  
	              case 5:
	                  System.out.println("Modulus Operation = "+(a%b));
	                  break;
	              case 6:
	                  System.exit(0);
	                  System.out.println("Application Closed");
	              default:
	                  System.out.println("Wrong Choice!!");
	                  break;
	                      
	          }
              System.out.println("ThankYou FOR USING CALUCULATER");

	       } 
	       
	    }
}
