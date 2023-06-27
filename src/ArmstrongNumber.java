import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class ArmstrongNumber {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		int number, total,remainder=0,sum=0;
		
		BufferedReader armstrong=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please Enter the Number to Check Whether ArmStrong or Not");
		 number=Integer.parseInt(armstrong.readLine());
		
		total=number;
		
		while(number>0) {                       // 
			
			remainder=number%10;                //  
			sum=sum+(remainder*remainder*remainder);     //  1+343=344+27
			number=number/10;                   //  371
			
			
		}
		
		if(total==sum) {
			System.out.println("The given Number is ArmStrong Number"+sum);
		}
		else {
			System.out.println("The Given Number is not An ArmStrong Number"+sum);
		
		}
		
		
	}

}
