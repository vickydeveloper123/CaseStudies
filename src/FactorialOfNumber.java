import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) throws NumberFormatException, IOException {

		int n, f, i;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the factorial Number");
		n = Integer.parseInt(br.readLine());

		i = n;
		f = 1;
		
		for(n=1;n<=5;n++)System.out.println(n);

		while (i > 0) {

			f = f * i;

			System.out.println(i);
			i--;
			System.out.println("Product of Series of Given Numbers==="+f);

		}

	}

}
