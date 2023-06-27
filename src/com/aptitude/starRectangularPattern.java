package com.aptitude;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class starRectangularPattern {

	public static void main(String[] args) throws Exception {

		int i, j, row;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the number to rows to design rectangular star pattern");

		row = Integer.parseInt(br.readLine());

		for (i = 1; i <= row; i++) {

			for (j = 1; j <= i; j++) {
				System.out.println("*");
			}
			System.out.println("\n");

		}

	}

}