import java.util.Arrays;

public class MergeTwoArrays {
	public static void main(String [] args)
	{
		int a[]= {1,2,3,4,5};
		int b[]= {6,7,8,9,0};
		int c = (a.length+b.length);
//		System.out.println(c);
		int result []=new int[c];	
		int pos=0;
		for(int i = 0;i<a.length;i++)
		{
			result[pos] = a[i];
			pos++;
		}
		for(int j = 0;j<b.length;j++)
		{
			result[pos]=b[j];	
		      pos++;	
		}
		
		System.out.println(Arrays.toString(result));
	}

}
