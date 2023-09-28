class CountDigitInElements
{
  public static void main(String [] args)
  {
    int a[]={123,546,987,456,2343};
    
    for(int i =0;i<a.length;i++)
    {
      int n = a[i];
      int count=0;
      
      while(n>0)
      {
        count++;
       // System.out.println(n%10);
        n=n/10;
        
    }
    System.out.println("Count of digits in "+a[i]+" is "+count);
  }
  }
}