import java.util.HashSet;
import java.util.Set;

public class Duplicate {
	public static void main(String [] args)
	{
		int a[]={1,1,1, 2, 3, 6, 3, 6, 1};
		
		Set<Integer>set = new HashSet<>();
		
		for(int i =0;i<a.length;i++)
		{
			set.add(a[i]);
		}
		//System.out.println(set);
		
		for(Integer i:set)
		{
			int count=0;
			for(int j =0;j<a.length;j++)
			{
				if(i==a[j])
				{
					count++;
				}
			}
			//System.out.println("count for "+i+"is"+count);
			if(count>1)
			{
				System.out.println(i+" "+count);
			}
			
		}
		
		
		
		
//		for(int i =0;i<a.length;i++)
//		{
//			int count=0;
//			for(int j=0;j<a.length;j++)
//			{
//			if(a[i]==a[j])
//			{
//				count++;
//			}
//			}
//			if(count>1) {
//			
//				System.out.println(a[i]);
//			}
//			}
		}
	}


