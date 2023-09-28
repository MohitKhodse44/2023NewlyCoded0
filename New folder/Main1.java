
public class Main1
{
	int a;
	Main1(int a){
		this.a = a;
		
	}
	public boolean equals(Object o)
	{
		Main1 m2= (Main1) o;
		return this.a== m2.a;
	}
public static void main(String [] argrs)
{
	Main1 d= new Main1(200);
	Main1 x = new Main1(200);
	System.out.println(d); //Main1@1eb44e46
	System.out.println(x); // Main1@1c4af82c
	System.out.println(d==x);
////	System.out.println(m1.equals(m2));
	System.out.println(d.equals(x));
	
}

	
	
}
