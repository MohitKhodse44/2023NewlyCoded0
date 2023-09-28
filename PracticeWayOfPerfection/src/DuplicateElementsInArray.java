
public class DuplicateElementsInArray {
	public static void main(String[] args) {
		
		   int[] a = {1 ,2 ,5, 5, 6, 6, 7, 2};
		   
		   for(int i =0;i<a.length;i++)
		   {
			   for(int j=i+1;j<a.length;j++)   //here we have to use j=i+1 not 0.or else it will print duplicate value again and again.
			   {                                 
				   if(a[i]==a[j] && i!=j)
				   {
					   System.out.println(a[i]);
				   }
			   }
		   }	   
	}

}
