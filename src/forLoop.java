
public class forLoop {
	
	public static void main(String[] args) {
		
		int sum=0;
		for(int number=1;number<=10;number=number+1) {
			System.out.println(sum);

			sum=sum+number;
			System.out.println("Numbers Adding===>"+number);
		}
		System.out.println("By Using For Loop for the sum of given Digits==>"+sum);
	}

}
