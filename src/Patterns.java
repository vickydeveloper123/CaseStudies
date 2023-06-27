import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patterns {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int row,t,i,j,k,s=0;
		
		BufferedReader pattern=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Pattern");
		 row=Integer.parseInt(pattern.readLine());
		 
		 t=1;
		 
		 for(i=1;i<=row;i++)
		 {
			 for(j=0;j<=(row-1);j++) {
				 System.out.println(" ");
				 s=(2*i)-1;
				 for(k=0;k<s;k++) {
					 if(t<10)
						 System.out.println(t);
					 else
						 System.out.println(t);
					 t++;
				 }
			 }
			 System.out.println("\n");
		 }
	}
}
