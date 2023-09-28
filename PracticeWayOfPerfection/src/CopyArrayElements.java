import java.util.Arrays;

public class CopyArrayElements {
	public static void main(String [] args)
	{
		int a[]= {1,2,3,4,5};
//		int b []= a;
//		System.out.println(Arrays.toString(b));
		
		
		//using for loop 
		int pos=0;
		int c[]= new int[a.length];
		for(int i =0;i<a.length;i++)
		{
			c[pos]=a[i];
			pos++;
			
			
		}
		System.out.println("c: "+Arrays.toString(c));
		
	}

}
