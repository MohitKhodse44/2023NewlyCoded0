class TestY{
	public static void main(String [] args)
	{
		String s1 ="mohit124";
		int sum=0;
		for(int i  =0;i<=s1.length()-1;i++)
		{
			char ch =s1.charAt(i);
			if(ch>=48&&ch<=57)
			{
				String s2= ch+"";
				int m = Integer.parseInt(s2);
				sum=sum+m;
			}
				
		}
		System.out.println(sum);
	}
}
