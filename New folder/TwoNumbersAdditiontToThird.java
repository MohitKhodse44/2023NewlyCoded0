import java.util.Scanner;

public class TwoNumbersAdditiontToThird {
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a the number:");
		int a = sc.nextInt();
		System.out.println("Enter b the number:");
		int b = sc.nextInt();
		System.out.println("Enter c the number:");
		int c = sc.nextInt();
		
		System.out.println(value(a,b,c));
		
		
	}
	public static boolean value(int x,int y,int z)
	{
		return ((x+y==z) || (y+z==x) || (x+z==y));
	}

}
