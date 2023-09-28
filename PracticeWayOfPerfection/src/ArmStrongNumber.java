import java.util.Scanner;

public class ArmStrongNumber {
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check:");
		int n =sc.nextInt();
		int count=0;
		int num=n;
		int sum=0;
		int flag=num;
		
		while(n>0)
		{
			count++;
			n=n/10;
		}
		//System.out.println(count);
		
		while(num>0)
		{
			int digit=num%10;
			int power=(int)Math.pow(digit, count);
			sum=sum+power;
			num=num/10;
		}
		//System.out.println(sum);
		
		if(flag==sum)
		{
			System.out.println("yes,it's ArmStrong Number");
		}
		else {
			System.out.println("Sorry,try another");
		}
		
	}

}
