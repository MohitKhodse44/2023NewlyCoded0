import java.util.Arrays;

public class AddElementInArray {
	public static void main(String[] args) {
		
		 int[] a = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		 System.out.println(Arrays.toString(a));
		 int item =5;
		 int pos=2;
		 //first remove last element and mak place for new element.
		 
		 //we are starting loop from back to remove last element to keep size of array same and adding new element at any position by 
		 //making place for it self.
		 for(int i =a.length-1;i>pos;i--)
		 {
			 a[i]=a[i-1];
		 }
		 System.out.println(Arrays.toString(a));
//		 [25, 14, 56, 15, 36, 56, 77, 18, 29, 49]
//				 [25, 14, 56, 56, 15, 36, 56, 77, 18, 29]

		 for(int i=0;i<=a.length-1;i++)
		 {
			 if(i==pos)
			 {
				 a[i]=item;
			 }
			 
			 
			 
		 }
		 System.out.println(Arrays.toString(a));
		 
		 
		 
		 
		 
	}

}
