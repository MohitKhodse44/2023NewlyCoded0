import java.util.Scanner;

public class ArmStrong {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int copy=num;
		int count=0;
		int sum=0;
		int flag=copy;
		
		while(num>0)
		{
			count++;
			num=num/10;
		}
		//System.out.println("count: "+ count);
		
		while(copy>0)
		{
			int rem=copy%10;
			int power=1;
			for(int i =1;i<=count;i++)
			{
				power=power*rem;
			}
			
			sum=sum+power;
			
			copy=copy/10;
		}
		
		if(flag==sum)
		{
			System.out.println("armstrong");
		}
		else {
			System.out.println("Not armstrong");
			System.out.println("Enter the number again:");
			num=sc.nextInt();
			
		}
		
		
		
		
	}
	
	

}
