import java.util.Arrays;

public class StringCharCount {
	public static void main(String [] args)
	{
		String s1 ="sing is king";
		String []u =s1.split(" ");
		System.out.println(Arrays.toString(u));
		for(int j = 0;j<=u.length-1;j++)
		{
			System.out.println(u[j].length());
		}
		
	}

}
