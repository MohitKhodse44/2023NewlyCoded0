import java.util.Scanner;

public class Main {
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the binary number:");
		int n =sc.nextInt();
		int sum=0;
		int power=0;
		
		while(n>0)
		{
			int digit=n%10;
			int x=digit*(int)Math.pow(2,power);
			sum=sum+x;
			n/=10;
			power++;
			
			
		}
		System.out.println(sum);
		
	}

}
