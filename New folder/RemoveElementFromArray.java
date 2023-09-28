import java.util.*;
class RemoveElementFromArray
{
  public static void main(String [] args)
  {
    int[] a = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
    System.out.println(Arrays.toString(a));
    int item=14;
    int index=0;
    for(int i = 0;i<a.length;i++)
    {
      if(a[i]==item)
      {
       index=i;
      }
    } 
    for(int i=index;i<a.length-1;i++)
      {
        a[i]=a[i+1];
      }
    a=Arrays.copyOf(a, a.length-1);
    System.out.println(Arrays.toString(a));
  }
}
