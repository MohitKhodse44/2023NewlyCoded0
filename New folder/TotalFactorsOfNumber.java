
public class TotalFactorsOfNumber {
	public static void main(String [] args)
	{
		int n =20;
		int count=0;
		for(int i = 1;i<20;i++)
		{
			if(n%i==0)
			{
				count++;
				System.out.println(i);
			}
		}
		System.out.println("count= "+count);
	}

}
