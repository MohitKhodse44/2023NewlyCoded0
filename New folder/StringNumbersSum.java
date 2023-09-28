class StringNumbersSum{
	public static void main(String [] args)
	{
		String s1 ="mohit124";
		int sum=0;
		for(int i  =0;i<s1.length();i++)
		{
			char ch =s1.charAt(i);
			if(ch>='0'&&ch<='9')
			{
				String s2= ch+"";
				int m = Integer.parseInt(s2);
				sum=sum+m;
			}
				
		}
		System.out.println(sum);
	}
}

