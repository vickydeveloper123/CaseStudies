package com.aptitude;

import java.util.Scanner;

public class StudentResults {
	public static void main(String[] args) {
		System.out.println("***********Student Marks Result************");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the marks to check result to check Pass or Fail");

		System.out.println("Enter Telugu marks");
		int telugu = scanner.nextInt();

		System.out.println("Enter Hindi Marks");
		int Hindi = scanner.nextInt();

		System.out.println("Enter English Marks");
		int English = scanner.nextInt();

		if (telugu >= 35)
			System.out.println("PASS");
		if (telugu < 35)
			System.out.println("Fail");
		if(telugu<35)
			System.out.println("Better Luck Next Time");

		if (Hindi >= 35)
			System.out.println("PASS");
		if (Hindi < 35)
			System.out.println("Fail");
		if (Hindi < 35)
			System.out.println("Better Luck Next Time");

		if (English >= 35)
			System.out.println("PASS");
		if (English < 35)
			System.out.println("Fail");
		if(English<35) System.out.println("Better Luck Next Time");
		
		System.out.println("***********Wish u all the best for future carrier********");



	}


}
