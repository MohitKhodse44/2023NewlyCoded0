import java.util.Scanner;

public class CountingZeroesFromNumber {
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n= sc.nextInt();
		int count=0;
		
		
		while(n>0)
		{
			int digit=n%10;
			if(digit==0)
			{
				count++;
			}
			n/=10;
			
		}
		System.out.println("Number of zeroes number have are:"+count);
	}

}
