import java.util.Scanner;

public class AddTwoMatrix {
	public static void main(String[] args) {
		
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the values of m rows:");
	int m=sc.nextInt();
	System.out.println("enter the values of n coloms:");
	int n =sc.nextInt();
	
		int a[][]=new int[m][n];
		int b [][]= new int[m][n];
		int z[][]= new int[m][n];
		
		System.out.println("enter the values of a:");
		for(int i =0;i<a.length;i++)
		{
			for(int j =0;j<a.length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter the values of b:");
		for(int i =0;i<b.length;i++)
		{
			for(int j =0;j<b.length;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		for(int i =0;i<z.length;i++)
		{
			for(int j =0;j<z.length;j++)
			{
				z[i][j]=a[i][j]+b[i][j];
			}
			
		}
		
		for(int i =0;i<m;i++)
		{
			for(int j =0;j<n;j++)
			{
				System.out.print("["+z[i][j]+"]");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	}

}
