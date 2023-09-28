
public class Primenumber {
	public void prime(int n)
	{
		
		for(int i = 2; i<=n;i++)
		{
			int count=0;
			for(int j  = 1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(i);
			}
			
			} 
		}
	
		public static void main(String [] args)
		{
			int n =100;
			Primenumber  p1 = new Primenumber();
			p1.prime(n);
		}
		
			

}
