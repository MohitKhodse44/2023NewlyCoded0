package Atmproject;


public class Bank {

	String name;
	private double balance;
	private int pin;
	long acNo;
	
	
	Bank(String name,long acNo,double balance,int pin)
	{
		this.name= name;
		this.acNo=acNo;
		this.balance= balance;
		this.pin= pin;
	}
	
    public double getBalance()
    {
    	return this.balance;
    }
    public void setBalance(double balance)
    {
    	this.balance= balance;
    }
    
    public double getpin()
    {
    	return this.pin;
    	
    }
    
    public void setPin(int pin)
    {
    	this.pin = pin;
    	
    }
    
    public void getDetails()
    {
    	System.out.println("Detail of customer");
    	System.out.println("Name: "+ name + ",\nAccount No: "+acNo + ",\nbalance: "+balance);
    }
}

