package Atmproject;

import java.util.Scanner;

public class ATMDriver {
	static Scanner sc = new Scanner(System.in);
	public static void main(String [] args)
	{
		Bank c1 = new Bank("Mohit",2345678,12000,0000);
		ATMSBI a = new ATMSBIChild();
		boolean b = true;
		while(b)
		{
		System.out.println("Enter the \n 1: to withdraw money \n 2: to deposit money\n 3: to checkbalance of account  \n 4: to changepin of account\n 5: to  details account ");
		int option =sc.nextInt();
		
		switch(option)
		{
		case 1:a.withdraw(c1);break;
		case 2:a.deposit(c1);break;
		case 3:a.checkBalance(c1);break;
		case 4:a.changePin(c1);break;
		case 5:a.details(c1);break;
		default:System.out.println("choose correct option");
		}
		System.out.println("Do you want to continue then choose option:");
		int v = sc.nextInt();
		if(v >=7)
		{
			b = false;
		}
		}
		}
		
		}
	


