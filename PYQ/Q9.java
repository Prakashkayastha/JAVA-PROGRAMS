import java.util.*;
import javax.swing.*;
class InvalidDivisionException1 extends Exception
{
	int a;
	InvalidDivisionException1(int x)
	{
		a=x;
	}
	public String toString()
	{
		String msg="InvalidDivisionException1 : Entered number is a prime number,so please enter a non prime number";
		return msg;
	}
}
class InvalidDivisionException2 extends Exception
{
	int a,b;
	InvalidDivisionException2(int x,int y)
	{
		a=x;
		b=y;
	}
	public String toString()
	{
		String msg="InvalidDivisionException2 : The input you enterd ,after division there modulus is not zero,so please enter valid input";
		return msg;
	}
}
interface DivisionMethod
{
	boolean isprime(int x);
	boolean ismodulus(int x,int y);
	
}
class Division implements DivisionMethod
{
	int x,y;
	Division(int a,int b)
	{
		x=a;
		y=b;
	}
	public boolean isprime(int x)
	{
		boolean flag=false;
		for(int i=2;i<x;i++)
		{
			if(x%i == 0)
			flag=true;
		}
		
		if(flag)
		return false;
		else
		return true;
	}
	public boolean ismodulus(int x,int y)
	{
		if(x%y == 0)
			return false;
		else
			return true;
	}
}
class Q9
{
	public static void main(String args[])
	{
		
		String input1=JOptionPane.showInputDialog("Enter the first number:");
		String input2=JOptionPane.showInputDialog("Enter the second number:");
		int a=Integer.parseInt(input1);
		int b=Integer.parseInt(input2);
		Division obj=new Division(a,b);
		
		try
		{
			if(obj.isprime(a))
			{
				throw  new InvalidDivisionException1(a) ;
			}
		}
		catch(InvalidDivisionException1 i1)
		{
			System.out.println("Division can't possible");
			System.out.println(i1);
		}
		try
		{
			if(obj.ismodulus(a,b))
			{
				throw new InvalidDivisionException2(a,b);
			}
		}
		catch(InvalidDivisionException2 i2)
		{
			System.out.println("Division can't possible");
			System.out.println(i2);
		}
		if(obj.isprime(a) == false && obj.ismodulus(a,b)== false)
		System.out.println("Division of a and b is:"+a/b);
	}
}
