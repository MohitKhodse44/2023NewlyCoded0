
public class CeilingNumber {
	public static void main(String [] mohit)
	{
		int a[]= {1,2,4,5,7,8,9};
		 int target=3;
		 int start=0;
		 int end=a.length-1;
		 System.out.println("ceilingNumber of "+target+ " is :"+ceiling(start,a,target,end));
	}
		 public  static int ceiling(int start,int a[],int target,int end) {
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
				return a[mid]; 
			 }
			 
		 }
		return a[start];
		 }

}
