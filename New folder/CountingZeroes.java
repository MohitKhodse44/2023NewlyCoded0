 import java.util.Scanner;

public class CountingZeroes {
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		System.out.println(digitCount(n));
		sc.close();
	}
	public static int digitCount(int m)
	{
		int count=0;
		 int a  =m;
		 while(a>0)
		 {
			 int digit =a%10;
			 if(digit== 0)
			 {
				count++; 
			 }
			 a= a/10;
			 
		 }
		 return count;
		
	}
	

}
