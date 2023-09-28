import java.util.*;
public class ArmStrong {
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		int originalNumber=n;
		int sum=0;
		while(n>0)
		{
			int rem = n%10;
			int x3= (int) Math.pow(rem,3);
			sum= sum+x3;
			n=n/10;
		}
		if(sum == originalNumber)
		{
			
			System.out.println("Number is ArmString Number.");
		}
		else {
			System.out.println(sum);
			System.out.println("It's not, try another!");
		}
		
		
	}

}
