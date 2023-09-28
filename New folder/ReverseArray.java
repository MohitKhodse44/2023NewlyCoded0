import java.util.Arrays;

public class ReverseArray {
	public static void main(String [] args)
	{
		int a[]={10, 20, 15, 2, 23, 90, 67};
//		int m =(a.length)/2;
		for(int i =0;i<a.length/2;i++)
		{
			int temp=a[i];
			a[i]=a[a.length-1-i];
			a[a.length-i-1]=temp;
		}
		System.out.println(Arrays.toString(a));
	}

}
