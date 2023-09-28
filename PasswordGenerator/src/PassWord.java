import java.util.Arrays;
import java.util.Scanner;

public class PassWord {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the total number of random passwords you want to create :");
		int total = sc.nextInt();
		
		System.out.println("Enter how many characters long you want your password :");
		int length=sc.nextInt();
		
		String [] randomPasswords=new String[total]; //array for the storing multiple passwords.
		//loop for total numbers of password.
		for(int i =0;i<total;i++)
		
		{
			////generate one random password
			String randomPassword="";
			for(int j =0;j<length;j++)
			{
				//generate one random character
				randomPassword+=randomCharacter();
			}
			//add our random passwords to array.
			randomPasswords[i]=randomPassword;
		}
		
		//print array
		System.out.println(Arrays.toString(randomPasswords));
		System.out.println(Strength( length));
		
		
		
		
	}
	
	public static String Strength(int length)
	{
		if(length<5)
		{
			return "weak";
		}
		else if(length<10)
		{
			return "Medium";
		}
		else {
			return "Strong";
		}
	}
	public static char randomCharacter()
	{
		//multiply with 62 because total 62 values are their like 0-9 i.e (10) for numnbers
		// 26 uppercase characters and 26 lowercasecharacters
		//so total 10+26+26=62 posibilities.
		
		int rand=(int)(Math.random()*62);  //Math.random() for taking random value of 
		                                     //double type between [0,1).
		
		if(rand<=9)
		{
			//for numbers between 0-9 ,ASCII value is 48-57;
			int ascii=rand+48;      // 48-0=48; adding values in 48 to get value above 48 i.e 0.
			return (char) (ascii); // return int type to char type data using cast operator.
		}
		else if(rand<=35)  //for the uppercase letters:rand would be 10-35 
		{
			int ascii=rand+55;   // i.e 65-10=55
			return (char) ascii;    //// return int type to char type data using cast operator.
		}
		else {
			// for lowercase letter rand be 36-61 
			int ascii=rand + 61;   //97-36=61
			return (char) ascii;
		}
		
		
		
	}

}
