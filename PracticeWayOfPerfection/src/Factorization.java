import java.util.Scanner;

public class Factorization {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number :");
		int n= sc.nextInt();
		int flag=n;
		int factor=1;
		
		while(n>0)
		{
			factor=factor*n;
			n--;
		}
		System.out.println(flag+" factorization is :"+factor);
		
		
		
	}

}
