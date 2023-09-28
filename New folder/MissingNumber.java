
public class MissingNumber {
	public static void main(String [] args)
	{
		
		int a[]= {1,2,3,5,6,7,8,9};
		int n =a.length;
		int sum= ((n+1)*(n+2))/2;
		
		
//		System.out.println(sum);
		for(int j =0;j<a.length;j++)
		{
			sum=sum-a[j];
		}
		System.out.println(sum);
		
	}

}
