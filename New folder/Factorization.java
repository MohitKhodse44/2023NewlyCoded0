import java.util.Scanner;

public class Factorization 
{
  public static void main(String [] args)
  {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the number you want to factorial of:");
	  int m= sc.nextInt();
	  int o=m;
	  fact(o);
  }
  public static void fact(int n)
  {
	  System.out.println("factoral of number is:");
	  int factorial=1;
	  while(n>0)
	  {
		   factorial = factorial*n;
		   n--;
	  }
	  System.out.println(factorial);
  }
	
	
	
}
