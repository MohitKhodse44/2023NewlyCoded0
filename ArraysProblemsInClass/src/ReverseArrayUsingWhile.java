import java.util.Arrays;

public class ReverseArrayUsingWhile {
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,8};
		
		int start =0;
		int end=a.length-1;
		
		
		//Using while loop
		
		while(start<end)  //
		{
			int temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			start++;
			end--;
		}
		System.out.println(Arrays.toString(a));
		
		
		
		//using for loop;
//		for(int i =0;i<(a.length)/2;i++)
//		{
//			int temp=a[i];
//			a[i]=a[a.length-1-i];
//			a[a.length-1-i]=temp;
//		}
//		System.out.println(Arrays.toString(a));
		
		
	}

}
