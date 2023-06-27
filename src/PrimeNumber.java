import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;



public class PrimeNumber {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int c=0;
		
		BufferedReader primeNumber=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Please Enter the Number to check whether its Prime or Not====>");
		int a=Integer.parseInt(primeNumber.readLine());
		System.out.println("Please Enter B Value");
		int b=Integer.parseInt(primeNumber.readLine());
		while(b<=a) {
			if(a%b==0) {
				c=c+1;
			}
			b++;
		}
		
		if(c==2) {
			System.out.println(" Prime");
		}
		else {
			System.out.println("NOT PRIME");
		}
			
	}

}
