import java.util.Scanner;

public class ReverseANumber {
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		int reverseNumber=0;
	
		
		while(n>0)
		{
			int digit=n%10;
			reverseNumber=reverseNumber*10+digit;
			n/=10;
			
		}
		System.out.println("reverseNumber:"+reverseNumber);
		
	}
}
