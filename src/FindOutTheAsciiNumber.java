import java.io.IOException;

public class FindOutTheAsciiNumber {
	
	public static void main(String[] args) {
		System.out.println("Please Enter the Number to find the Ascii Number value");
		
		try {
			byte b=(byte)System.in.read();
			System.out.println(b);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
