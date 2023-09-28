import java.util.Arrays;

public class SecondMax {

	public static void main(String[] args) {
		int a[]= {45,9,7,4,8,6,3,89,2};
//		Arrays.sort(a);
//		for(int i =0;i<a.length;i++)
//		{
//			//System.out.print(a[i]+" ");
//		
//		}
//		System.out.println(Arrays.toString(a));
//		System.out.println(a[a.length-2]);
		
//		for(int i =0;i<a.length;i++)
//		{
//			for(int j =i+1;j<a.length;j++)
//			{
//				if(a[i]>a[j])
//				{
//					int temp =a[i];
//					a[i]=a[j];
//					a[j]=temp;
//					
//				}
//				
//			}
//		}
//		System.out.println(Arrays.toString(a));
//		
			
//		
//		for(int i =0;i<a.length;i++)
//			{
//				for(int j =i+1;j<a.length;j++)
//				{
//					if(a[i]<a[j])
//					{
//						int temp =a[i];
//						a[i]=a[j];
//						a[j]=temp;
//						
//				}
//					
//				}
//			}
//			System.out.println(Arrays.toString(a));	
//			
//			for(int i =0;i<a.length;i++)
//			{
//				for(int j =i+1;j<a.length;j++)
//				{
//					if(a[i]>a[j])
//					{
//						int temp =a[i];
//						a[i]=a[j];
//						a[j]=temp;
//						
//				}
//					
//				}
//			}
//			System.out.println(Arrays.toString(a));	
		
		
		
//		Addition of odd and sum
//		int oddsum=0;
//		int evensum=0;
//		for(int i =0;i<a.length;i++)
//		{
//			if(a[i]%2!=0)
//			{
//				oddsum=oddsum+a[i];
//			}
//			if(a[i]%2==0)
//			{
//				evensum=evensum+a[i];
//			}
//		}
//		System.out.println("oddsum="+oddsum);
//		System.out.println("evensum="+evensum);
//		
//		
//		difference between min and maximum
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		int max=a[a.length-1];
		System.out.println(max);
		int min=a[0];
		System.out.println(min);
		int difference =max-min;
		System.out.println("difference:"+difference);
		
		
		
		
		
	}
	

}
