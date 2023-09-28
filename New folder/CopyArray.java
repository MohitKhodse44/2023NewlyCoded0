import java.util.Arrays;

public class CopyArray {
	public static void main(String [] args)
	{
		int a[]= {1,2,3,4,5,6,7,8,9};
		
//		int b[]=new int[a.length];
//		int pos=0;
//		for(int i=0;i<a.length;i++)
//		{
//			b[pos]=a[i];
//			pos++;
//		}
//		System.out.println(Arrays.toString(b));
		
		int c[]=a;
		System.out.println(c.length);
		System.out.println(Arrays.toString(c));
		
		
				}

}
