
public class CountOccuranceOFaNumber {
	public static void main(String [] args)
	{
		int a[]= {1,2,3,1,2,3,4,5,6,7,8,5,4,3,3,3,3,3};
		int x=3;
		int count=0; 
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==3) {
				count++;
			}
		}
		System.out.println(count);
	}

}
