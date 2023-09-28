
public class CountEvenNumInElementOfArray {
public static void main(String[] args) {
	

	//numbers which has atleast even numbers
int a[]={123,546,987,456,234};   
    
    for(int i =0;i<a.length;i++)
    {
      int n = a[i];
      int count=0;
      
      while(n>0)
      {
        int digit=n%10;
        if(digit%2==0)
        {
        	count++;
        }
        n=n/10;
        
        
    }
      if(count>=2)
      {
    	  System.out.println(a[i]);
      }
      
    }
}
}

