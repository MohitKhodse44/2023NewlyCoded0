import java.util.Arrays;

public class DigitSummation 
{
  public static void main(String [] args)
  {
	 String s1 = "1234";
	 int sum= 0;
  for(int i = 0;i<=s1.length()-1;i++)
  {
	  char  ch = s1.charAt(i);
	//  System.out.println(ch);
	  if(Character.isDigit(ch))
	  {
	  int a = Character.getNumericValue(ch);
	  sum= sum+a;
	  }
  }
  System.out.println(sum);
	 
	 
	 
	 
  }
}
	 