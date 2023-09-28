
public class StringArmStrng {
public static void main(String [] args)
{
	int n = 92727;
	int m = n;
	String s1 = n+"";
	int sum = 0;
	while(n>0)
	{
		int rem= n%10;
		int x3=(int)Math.pow(rem,s1.length());
		sum+=x3;
		n=n/10;
	}
	if( m== sum) {
	System.out.println("armStrong");
	}
	else {
		System.out.println("Not");
	}
	
}
}



