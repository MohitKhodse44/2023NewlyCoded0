import java.util.Arrays;

public class NonRepeateNumber {
	public static void main(String [] args)
	{
		int a[]= {1,2,3,4,5,1,2,3,4};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		if(a[0]!=a[1])
		{
			System.out.println(a[0]);
		}
		for(int i=1;i<a.length-1;i++)
		{
			if((a[i]!=a[i+1]) && (a[i]!=a[i-1]))
			{
				System.out.println(a[i]);
			}
		}
		if((a[a.length-1])!=(a[a.length-2]))
		{
			System.out.println(a[a.length-1]);
		}
	}

}
