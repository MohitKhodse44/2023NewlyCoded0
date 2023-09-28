import java.util.Arrays;

//here we are adding perticula element at perticular index position
public class AddElementAtPerticularIndex 
{
	public static void main(String [] args)
	{
		int a[]= {1,2,3,4,5,6,7,8};
		int item=9;
		int pos=2;
		
		//this loop is used to remove last element and make 
		//copy of that index present number so that we can replace original one.
		for(int i =a.length-1;i>1;i--)
		{
			a[i]=a[i-1];
		}
		System.out.println(Arrays.toString(a));
		
		for(int i=0;i<a.length;i++)
		{
			if(i==pos)
			{
				a[i]=item;
			}
		}
		System.out.println(Arrays.toString(a));
		
		
		
	}

}
