
public class ArrayMin {
public static void main(String [] args)
{
	int a[]= {1,2,3,4,5,6,7,8,9};
	int min =a[0];
	for(int i =0;i<=a.length-1;i++)
	{
		if(a[i]<min)
		{
			min = a[i];
		}
	}
	System.out.println(min);
	
	
	
			}
}
