	import java.util.*;
public class StringWordReverse {
	
	  public static void main(String [] args)
	  {
	    String s1="hello world";
	    String a[]=s1.split(" ");
	   String s4="";
	     
	    for(int i=0;i<a.length;i++)
	    {
	      String s2=a[i];
	     StringBuffer sb = new StringBuffer(s2);
	      sb.reverse();
	      // System.out.println(sb);
	      s4=s4+sb+" ";
	    }
	    System.out.println(s4);
	   
	  }
	}
