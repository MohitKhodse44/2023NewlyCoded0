import java.util.Scanner;

public class PallindromeString {
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s1 = sc.nextLine();
	    String s2 ="";
		
		for(int i =s1.length()-1;i>=0;i--)
		{
			char ch = s1.charAt(i);
			s2=s2+ch;
			
		}
		//System.out.println(s2);
		if(s1.equals(s2))
		{
			System.out.println("It's pallindrome");
		}
		else {
			System.out.println("Not a pallinfrome");
		}
		
	}

}
