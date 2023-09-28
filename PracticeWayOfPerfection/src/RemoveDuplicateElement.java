import java.util.*;
import java.lang.*;

public class RemoveDuplicateElement 
{
	public static void main(String[] args)
{
	int a[]= {78,75,66,75,96,74,75,78,78,75};
	int index=0;
	
	for(int i =0;i<a.length;i++)
	{
		for(int j =i+1;j<a.length;j++)
		{
			if(a[i]==a[j])
			{
				index=j;
			for(int k=index;k<a.length-1;k++)
			{
				
				a[k]=a[k+1];
			}
			a=Arrays.copyOf(a,a.length-1);
			j--;
			}
		}
					
}
	System.out.println(Arrays.toString(a));
}
}
