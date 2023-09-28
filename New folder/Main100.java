public class Main100 
{	   
	           public static void main(String[] args)
			    {
			        String input = "Hello, world! How's it going?";
			        String result = input.replaceAll("[\\p{Punct}]", "");
			        
			        System.out.println("Original string: " + input);
			        System.out.println("String without punctuation: " + result);
			    }
			
	   
}

