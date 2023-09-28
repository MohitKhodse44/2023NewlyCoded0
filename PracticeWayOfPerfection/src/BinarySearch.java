
public class BinarySearch {
	public static void main(String [] args)
	{
		int a[]= {1,2,3,4,5,6,7,8,9};
		 int target=9;
		 int start=0;
		 int end=a.length-1;
		 
		 while(start<=end)
		 {
			 int mid= (start+end)/2;
			 if(target>a[mid])
			 {
				 start=mid+1;
				 
			 }
			 else if(target<a[mid])
			 {
				end=mid-1;
			 }
			 else {
				 System.out.println("Index is: "+ mid);
				 break;
			 }
			 
		 }
		
		 
	}

}
