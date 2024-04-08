import java.util.*;
interface Bankingoperations
{
	void deposit(int a);
	void withdraw(int a);
    void checkbalance();
	
}
class Bank implements Bankingoperations
{
	int amount;
	Bank()
	{
		amount=5000;
	}
	public void deposit(int a)
	{
		if(amount < 3000)
		{
			a -= 100;
			amount += a;
			System.out.println("Rs 100 deducted as penalty due to current balance is less than minimum balance");
			System.out.println("Rs"+a+" deposited succesfully");
			System.out.println("Available balance is the account = "+ amount);
		}
		else
		{
			amount += a;
			System.out.println("Rs "+ a+" deposited succesfully");
			System.out.println("Available balance in the account = "+ amount);
		}
		
	}
	public void withdraw(int a)
	{
		if(a<amount)
		{
			amount = amount - a;
			System.out.println("Rs "+a+" withdraw succesfully,remaining balance is: "+amount);
			if(amount < 3000)
			{
				System.out.println("Please maintain minimum balance as your current balance is less than minimum balance");
			}
		}
		else
		{
			System.out.println("Insufficient fund in your account");
		}
	}
	
	public void checkbalance()
	{
		System.out.println("Your current balance is : "+amount);
	}
}

public class Q5 {
     public static void main(String args[])
	{
		Bank obj=new Bank();
		obj.deposit(1000);
		obj.checkbalance();
		obj.withdraw(7000);
	}
}
