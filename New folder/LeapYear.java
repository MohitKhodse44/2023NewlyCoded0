
import java.util.*;
public class LeapYear 
{
public static void main(String []args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println(" enter the year :");
	int n = sc.nextInt();
	  year(n);
	
}
public static void year(int m)
{
	int n =m;
	if(((n%4==0) && (n%100 !=0)) || (n%400==0))
	{
		System.out.println( n +" is a leap year");
	}
	else {
		System.out.println("naa!");
	}
}
}
