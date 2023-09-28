

	import java.util.*;
	class TestY4
	{
	
	public static void main(String [] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String:");
	String s1 = sc.nextLine();
	String [] s2=s1.split(" ");
	int count=0;
	for(int i =0;i<s2.length;i++)
	{
	String word=s2[i];
	char ch=word.charAt(0);
	
	if(ch=='a' || ch=='e'||ch=='i'||ch=='o'||ch=='u')
	{
	count++;
	}
	
	}
	System.out.println(count);
	
	}
	}




