class XylemNumber
{
  public static void main(String [] args)
  {
    int n =123456789;
    int count=0;
    int copy=n;
    int flag=n;
    
    while(n>0)
    {
      count++;
      n=n/10;
    }
   // System.out.println(count);
    
    
    int lastdigit=copy%10;
    //System.out.println("lastdigit: "+lastdigit);
    
    int firstdigit=copy/(int)Math.pow(10,count-1);
   // System.out.println("firstdigit: "+firstdigit);
    
    int case1=lastdigit+firstdigit;
    System.out.println("case1: "+case1);
    
    int case2=0;
    while(flag>0)
    {
      int digit=flag%10;
      if(digit!=firstdigit && digit!=lastdigit)
      {
        case2=case2+digit;
      }
      flag=flag/10; 
    }
    System.out.println("case2: "+case2);
    
    
    if(case1==case2)
    {
      System.out.println("xylem number");
    }
    else{
      System.out.println("it's not a xylem number");
    }
    
  }
}

