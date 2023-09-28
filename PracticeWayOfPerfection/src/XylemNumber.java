import java.util.Scanner;

public class XylemNumber {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number to check :");
		int n=sc.nextInt();
		int flag=n;
		int flag2=n;
		int last=0;
		int first=0;
		int sum=0;
		
		last=n%10;
		//System.out.println("last digit:"+last);
		
		
		String s1 =n+"";
		int count=s1.length();
		int value2=(int) Math.pow(10,count-1);
		 first = flag/value2;
		// System.out.println("first number:"+first);
		 
		while(flag2>0)
		{
			int digit=flag2%10;
			if(digit!=last && digit!=first)
			{
				sum+=digit;
			}
			flag2/=10;
		}
		//System.out.println("sum:"+sum);
		
		int case1=last+first;
		int case2=sum;
		
		if(case1==case2)
		{
			System.out.println("it is Xylem number");
		}
		else {
			System.out.println("not a xylem number");
		}
		
	}

}
