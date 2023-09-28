import java.util.Arrays;

public class RemoveDuplicateElement {
public static void main(String[] args) {
	
	 int a[]={20, 20, 30, 40, 50, 50, 50,60};
//	 System.out.println(a.length);
	 int index=0;
	 for(int i =0;i<a.length;i++)
	 {
		 
		 for(int j =i+1;j<a.length;j++)
		 {
			 if(a[i]==a[j])
			 {
				index=j;
				
				    //here i am adding condition as (i<a.length-1) not (i<=a.length-1)
				    //because last value is takes the place of previous  value in this loop.
                    //no further value to perform operation.
				
				for(int k =index;k<a.length-1;k++)
				 {   
					 a[k]=a[k+1];
					
					 
				 }
				 a=Arrays.copyOf(a, a.length-1);
				 j--;
			 }
		 }
	 }
	 
//	 System.out.println(a.length);
	 System.out.println(Arrays.toString(a));
	
}
}
