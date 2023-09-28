
class Satellite{
	private int speed;
	private String direction;
	
	
	Satellite(int speed,String direction)
	{
		this.speed =speed;
		this.direction=direction;
	}
	public int getSpeed()
	{
		return speed;
	}
	public String  getDirection()
	{
		return direction;
	}
	public void setDirection(String direction)
	{
		this.direction=direction;
	}
	public void setSpeed(int speed)
	{
		this.speed=speed;
	}
}
public class Main101 {
	public static void main(String [] args)
	{
		Satellite s1 = new Satellite(360,"upward");
			
				System.out.println(s1.getSpeed());
				System.out.println(s1.getDirection());
				s1.setSpeed(460);
				s1.setDirection("Downward");
				System.out.println(s1.getSpeed());
				System.out.println(s1.getDirection());
	}

}
