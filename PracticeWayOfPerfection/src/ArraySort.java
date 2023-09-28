import java.util.Arrays;

public class ArraySort {
	public static void main(String[] args) {
		
		int a[]= {23,2,7,3,8,2,8,0,5,2,1,6,};
		
		//Bubble sort
		
		
		for(int i =0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]<a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
