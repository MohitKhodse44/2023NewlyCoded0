
public class GCDorHCFofTwoNUmbers {
	public static void main(String [] args)
	{
		int n1 =15;int n2=20;
		int gcd=1;
		
		for(int i =1;i<=n1 && i<=n2;i++)
		{
			if(n1%i==0 &&n2%i==0)
			{
				gcd=i;
			}
		}
		System.out.println(gcd);
		
		//System.out.println(Gcd(10,0));;
		
	}
	
	//another way to find gcd is
//	static int Gcd(int a,int b)
//	{
//		if(b==0) {
//			return a;
//		}
//		return Gcd(b,a%b);
//	}

}
