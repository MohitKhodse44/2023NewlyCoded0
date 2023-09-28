package Atmproject;

import java.util.Scanner;

public class ATMSBIChild implements ATMSBI {
	Scanner sc = new Scanner(System.in);
	public void withdraw(Bank b)
	{
		boolean condition = true;
		while(condition)
		{
			System.out.println("Enter the pin");
			int pin = sc.nextInt();
			if(b.getpin()==pin)
			{
				System.out.println("Enter the amount to be withdraw");
				int amount=sc.nextInt();
				
				if(b.getBalance()>=amount)
				{
					b.setBalance(b.getBalance()-amount);
					System.out.println("your trasaction of RS."+ amount+"successful");
					condition= false;
					}
				else {
					System.out.println("Insufficient funds");
				}
			}
			else {
				System.out.println("Entered wrong pin");
			}
		}
	}
	
	
	  public void deposit(Bank b)
	  {
		  boolean condition= true;
		  while(condition)
		  {
			  System.out.println("Enter the pin");
			  int pin = sc.nextInt();
				if(b.getpin()==pin)
				{
					System.out.println("Enter the amount to be deposit");
					int amount=sc.nextInt();
					b.setBalance(b.getBalance()+amount);
					System.out.println("your trasaction is successful \n RS."+amount+"credited to your acNo"+b.acNo);
					System.out.println("Your current amount balance is :"+b.getBalance());
					condition= false;
		  }
				else {
					System.out.println("enter the wrong pin");
				}
	  }
	  }
	  
	  public void checkBalance(Bank b)
	  {
		  boolean condition = true;
		  while(condition)
		  {
			  System.out.println("Enter the pin");
			  int pin = sc.nextInt();
				if(b.getpin()==pin)
				{
					System.out.println("your account balance is "+b.getBalance());
					condition = false;
		  }
				else{
			    System.out.println(" Sorry Entered the wrong pin");
				}
		  }
	  }
	  
	  public void changePin(Bank b)
	  {
		  boolean condition = true;
		   while(condition)
		   {
			   System.out.println("Enter the pin");
			   int pin = sc.nextInt();
			   if(b.getpin()==pin)
			   {
				   System.out.println("Enter  your old pin");
			   
			   int oldpin = sc.nextInt();
			   if(b.getpin()==oldpin)
			   {
				boolean c2 = true;
				while(c2)
				{
					System.out.println("Enter the new pin");
					int newpin = sc.nextInt();
					System.out.println("Enter the new again pin");
					int newpin1 = sc.nextInt()	;
					
					if(newpin==newpin1)
					{
						b.setPin(newpin1);
						c2= false;
						condition=false;
						System.out.println("pins are matching successfully");
					}
					else {
						System.out.println("new pins are not matching");
					}
				}
			   }
			   
			   else {
				   System.out.println("old pin not matching");
			   }
			   }
			   
			   
		   else {
			   System.out.println("Entered wrong pin");
		   }
			   
		   } 
	  }
	  
	  
	  public void details(Bank b)
	  {
		  boolean condition = true;
		  while(condition)
		  {
			  System.out.println("Enter the pin");
		  
		  int pin = sc.nextInt();
		  if(b.getpin()== pin){
			  b.getDetails();
			  condition= false;
			  
			   
		  }
		  else {
			  System.out.println("Entered wrong pin");
		  }
				  
		  

		  }
	  
	  
	  

	  }


	
}

	  
	  
