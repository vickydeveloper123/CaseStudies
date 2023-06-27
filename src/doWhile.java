import java.util.Scanner;

public class doWhile {

	public static void main(String[] args) {

int i=0;
		int sum = 0;
		do {
			sum = sum + i; // 6+4=10

			i++; // 5

			System.out.println(sum); // 1

		} while (sum<=i);//
		System.out.println("Finally Result===>"+sum); // 1

	}
}