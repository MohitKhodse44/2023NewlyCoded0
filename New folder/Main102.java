import java.util.Arrays;
import java.util.Scanner;

public class Main102 {
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number to check:");
		
int n =sc.nextInt();
String s1 =n+"";
String []s2= s1.split("");
System.out.println(Arrays.toString(s2));

int a = Integer.parseInt(s2[0]);
int last=Integer.parseInt(s2[s2.length-1]);
//System.out.println(a);
//System.out.println(last);
int case1=a+last;
System.out.println("case1: "+case1);
int sum=0;
while(n>0)
{
	int digit=n%10;
	if(digit!=a  && digit!=last)
	{
	sum+=digit;	
	
	}
	n/=10;
}
System.out.println("sum: "+sum);

if(sum==case1)
{
	System.out.println("yes,it is xylem number");
	
}
else {
	System.out.println("Not xylem number.");
}

}
}
