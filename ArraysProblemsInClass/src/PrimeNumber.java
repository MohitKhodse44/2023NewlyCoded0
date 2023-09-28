
public class PrimeNumber {
	public static void main(String[] args) {
		
		int n=13;
		int factors=0;
		
		for(int i =1;i<=n;i++)
		{
			if(n%i==0)
			{
				factors++;
			}
		}
		if(factors==2)
		{
			System.out.println(n+" is prime number.");
		}
	}

}
