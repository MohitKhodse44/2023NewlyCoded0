import java.util.Arrays;
import java.util.Scanner;

public class StringWordReverse 
{
	public static void main(String [] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to reverse:");
		String s1 = sc.nextLine();
		String a[]= s1.split(" ");
		String flag="";
		//System.out.println(Arrays.toString(a));
		
		for(int i =0;i<a.length;i++)
		{
			String s2=a[i];
			StringBuffer sb= new StringBuffer(s2);
			sb.reverse();
			flag=flag+sb+" ";
		}
		System.out.println(flag);
		
		
		
		
		
		
	}
}
