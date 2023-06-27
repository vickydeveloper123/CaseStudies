package com.aptitude;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DrawingARectangle {

	public static void main(String[] args) throws Exception {

		int i, j, t = 1, row;

		BufferedReader ref = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the number of Row to print a Rectangle");

		row = Integer.parseInt(ref.readLine());

		for (i = 0; i < row; i++) {
			for (j = 0; j <= i; j++) {
				if (t < 10)
					System.out.println(t);

				else
					System.out.println(t);
				t++;
			}

			System.out.println("\n");
		}

	}

}
