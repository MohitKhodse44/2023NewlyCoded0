class SecondMaxWithoutSorting
{
  public static void main(String [] args)
  {
    int a[]= {1,2,3,4,5,6,7,8};
    int max=a[0];
    
    for(int i=0; i<a.length;i++)
    {
      if(a[i]>max)
      {
        max=a[i];
      }
    }
    // System.out.println(max);
    
     int secondmax=0;
    for(int i=0;i<a.length;i++)
    {
      if(a[i]<max )
      {
        secondmax=a[i];
      }
    }
    System.out.println("secondmax: "+secondmax);
    
    
    
    
  }
}
