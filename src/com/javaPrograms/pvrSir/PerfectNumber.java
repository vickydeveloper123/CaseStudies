package com.javaPrograms.pvrSir;

public class PerfectNumber {

	public static void main(String[] args) {
		int n = 3, d, sum = 0, count = 0;

		for (d = 1; d <= n; d++) {
			if (n % d == 0) {
				System.out.println("Factors Are=======>" + d);
				sum = sum + 1;
			} else
				System.out.println("Not Factors =>" + d);

			// sum=sum+1;
			System.out.println("total factors count===>" + sum);

			if (sum == 2)
				System.out.println("Perfect Number");
			else

				System.out.println("Not Perfect");
		}

	}

}
