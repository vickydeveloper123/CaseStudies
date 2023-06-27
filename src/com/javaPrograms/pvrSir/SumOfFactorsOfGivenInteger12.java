package com.javaPrograms.pvrSir;

public class SumOfFactorsOfGivenInteger12 {

	public static void main(String[] args) {

		int number = 10, factorSum=0, i,count=0;

		for (i = 1; i <= number; i++) {
			if (number % i == 0) {
				System.out.println("Factors are==>" + i);
		
			factorSum = factorSum+ i;// 0=0+1 ==> 0=1
			count=count+1;
			
			System.out.println("Sum of counting  Factors==>" + factorSum); // 14
			System.out.println("*********************************************");
			System.out.println(count+"===>Total Factors are Count");
	}		
	}

	}

}
