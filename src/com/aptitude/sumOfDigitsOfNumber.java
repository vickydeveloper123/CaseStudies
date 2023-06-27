package com.aptitude;

import java.util.Scanner;

public class sumOfDigitsOfNumber {

	public static void main(String[] args) {

		int sum = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of sum of natural numbersn=>=");
		int n = scanner.nextInt();

		do {
			sum = sum + n;

		} while (sum <= n);
		
		System.out.println("Resulting Adding Natural Numbers===>"+sum);

		n = sum / 10;

		sum = sum % 10;

		//System.out.println(sum);

		sum = sum + n;
		System.out.println("Finally Adding the resultant value digits==>" + sum);

	}

}