
public class NotSmallerThanNeibhbours {
	public static void main(String [] args)
	{
		int a[]={10, 20, 15, 2, 23, 90, 67};
		
		if(a[0]>a[1])
		{
			System.out.println(a[0]);
		}
		for(int i =1;i<=a.length-2;i++)
		{
			
	
			if((a[i]>a[i+1]) && a[i]>a[i-1])
			{
				System.out.println(a[i]);
			}
		}
		if(a[a.length-1]>a[a.length-2])
		{
			System.out.println(a[a.length-1]);
		}
	}

}
