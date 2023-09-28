import java.util.Arrays;

public class RemeovePerticularItemfromArray
{
	public static void main(String [] args)
	{
	    int[] a = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
	    int item=25;
	    int index=0;
	    
	    for(int i =0;i<a.length;i++)
	    {
	    	if(a[i]==item)
	    	{
	    		index =i;
	    	}
	    }
	    System.out.println(Arrays.toString(a));
	    
	  //  System.out.println(index);
	    
	    for(int j=index;j<a.length-1;j++)
	    {
	    	a[j]=a[j+1];
	    	
	    }
	   // System.out.println(Arrays.toString(a));
	    a=Arrays.copyOf(a, a.length-1);
	    
	    
	    System.out.println(Arrays.toString(a));
	    
	}

}
