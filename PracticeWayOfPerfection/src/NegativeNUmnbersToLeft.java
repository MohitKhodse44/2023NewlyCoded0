import java.util.Arrays;

public class NegativeNUmnbersToLeft {
	public static void main(String [] args)
	{
		int[] a = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
		
		int a2[]=new int[a.length];
		int count=0;
		for(int i =0;i<a.length;i++)
		{
			a2[count]=a[i];
			count++;
		}
	//	System.out.println(Arrays.toString(a2));
		
		int pos=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				a[pos]=a[i];
				pos++;
			}
		}
		
		//System.out.println(Arrays.toString(a));
		for(int j=0;j<a2.length;j++)
		{
			if(a2[j]>0)
			{
				a[pos]=a2[j];
				pos++;
			}
		}
		//System.out.println(pos);
		System.out.println(Arrays.toString(a));
		
	}

}
