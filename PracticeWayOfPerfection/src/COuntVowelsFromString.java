import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class COuntVowelsFromString {
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String s1 = sc.nextLine();
		int count=0;
		Set<Character> set = new HashSet<>();
		for(int i=0;i<s1.length();i++)
		{
			char ch = s1.charAt(i);
			set.add(ch);
		}
		//System.out.println(set);
		
		for(Character ch1:set)
		{
					if(ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u') {
						count++;
						System.out.print(ch1+",");
					}
				}
		System.out.println(" total vowels :"+count);
		
		
		
		
//		for(int i =0;i<s1.length();i++)
//		{
//			char ch = s1.charAt(i);
//			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')	
//			{
//				count++;
//				System.out.print(ch+",");
//			}
//			
//		}
		//System.out.println(" are total vowels :"+count);
	}

}
