import java.util.Arrays;
import java.util.Scanner;

public class StringRepaetingElement {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String:");
	String s1 = sc.nextLine();
	int pos=0;
	
	char[] s2= new char[s1.length()];
	for(int i =0;i<s1.length();i++)
	{
		s2[pos]=s1.charAt(i);
		pos++;
	}
	Arrays.sort(s2);
	for(int i =0;i<s2.length;i++)
	{
//		System.out.println(s2[i]);
	}
	
	if(s2[0]==s2[1]) {
		System.out.println(s2[0]);
	}
  for(int i = 1;i<=s2.length-2;i++)
  {
	  if(s2[i]==s2[i+1] )
	  {
		  System.out.println(s2[i]);
	  }
  }
  
	
	
	
	}
	

}
