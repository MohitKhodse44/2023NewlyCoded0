
public class Digitcount 
{
	public static void main(String [] args)
	{
		digit(100);
	}
	
	public static void digit(int n)
	{
		int count=0;
		while(n>0)
		{
			
			
			count++;
			n=n/10;
		}
		System.out.println(count);
	}

}
