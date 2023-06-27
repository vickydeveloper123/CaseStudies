import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckingBinaryNumberOrNot {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int n,r,c,t;
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please Enter ur Number");
		n=Integer.parseInt(bufferedReader.readLine());
		
		t=n;
		c=r=0;
		
		while(n!=0) {
			if(n%10==0  || n%10==1) {
				c++;
				r++;
				n=n/10;
			}
			if(c==r) {
				System.out.println("It is a binary Number");
			}
			else {
				System.out.println("Its not a binary Numnber");
			}
		}
	}

}
