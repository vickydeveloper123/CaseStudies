import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;


public class ProgramToCountNumberOfPrimeNumbers {
	public static void main(String[] args) throws NumberFormatException, IOException {
		int a=1,r;
		BufferedReader bufferedReader=new BufferedReader(new java.io.InputStreamReader(System.in));
		System.out.println("Enter the Number");
		r=Integer.parseInt(bufferedReader.readLine());
		
		while(a<=r)
			
		{
			int b=1,c=0;
			while(b<=r) {
			if(a%b==0) {
				c=c+1;
				b++;
			}
			if(c==2) {
				System.out.println("PrimeNumbers are  ===>"+a);
				a++;
			}
		}
		}
	}

}
