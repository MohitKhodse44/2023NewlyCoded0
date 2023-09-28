class Mohit
{
    int salary;
	String position;
	int id;
	Mohit(int salary,String position,int id)
	{
		this.salary= salary;
		this.position =position;
		this.id = id;
		
		
	}
	public String toString()
	{
		return (salary+" " + position +" " +id+" ");
	}
	public static void main(String [] args)
	{
		
		Mohit e1 =  new Mohit(1200,"developer",102);
		System.out.println(e1.toString());
		
		
	}
}
