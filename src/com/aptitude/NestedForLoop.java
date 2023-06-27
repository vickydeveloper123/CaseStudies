package com.aptitude;

public class NestedForLoop {

	public static void main(String[] args) {

//int a=0,b=0,c=0;
		for (int a = 1; a <= 5; a = a++)
			System.out.println(a);
			for (int b = 10; b <= 40; b = b + 10)
				for (int c = 90; c <= 100; c = c + 1) {
					System.out.println(c);
					System.out.println(b);

				}

	}

}
