
public class Students {
	int marks;
	
	Students(int marks)
	{
		this.marks= marks;
	}
	public boolean equals(Object o)
	{
		Students s1 = (Students)o;
		return this.marks==s1.marks;
		
	}
	public static void main(String [] args)
	{
		Students s1 = new Students(120);
		Students s2 = new Students(120);
		System.out.println(s1.equals(s2));
		
	}

}
