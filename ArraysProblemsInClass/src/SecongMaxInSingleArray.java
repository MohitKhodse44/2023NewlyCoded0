
public class SecongMaxInSingleArray {
	public static void main(String [] args)
	{
		
		
			
			    int a[]= {1,2,3,4,5,6,12,14,23,7};
			    int max=a[0];
			  int secondmax=0;
			  for(int i =0;i<a.length;i++)
			  {
				  if(a[i]>max)
				  {
					  secondmax=max;
					  max=a[i];
				  }
			  }
			  System.out.println(secondmax);
			 // System.out.println(max);
			    
			     
			    
			    
			    
			    
			    
			    
			  
			

	}

}
