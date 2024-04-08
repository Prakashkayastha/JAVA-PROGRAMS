//package RameshSir;
import java.util.*;
class Testthread extends Thread
{
	String tnm;
	Thread t;
	Testthread(String nm)
	{
		tnm=nm;
		t=new Thread(this,tnm);
		System.out.println("Thread in cpu:-"+Thread.currentThread());
		
		if(tnm.equals("one"))
		t.setPriority(9);
		if(tnm.equals("two"))
		t.setPriority(8);
		if(tnm.equals("three"))
		t.setPriority(7);
		t.start();
	}
	 public void run()
	{
		String ct=Thread.currentThread().getName();
		System.out.println("Thread in cpu:-"+Thread.currentThread());
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println(ct+":--"+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException ie)
		{
			System.out.println(ct+"Thread Interrupted");
			
		}
		System.out.println(ct+"Thread terminated");
	}
	
}
class Multithread1
{
	public static void main(String args[])
	{
		Testthread t1=new Testthread("one");
		Testthread t2=new Testthread("two");
		Testthread t3=new Testthread("three");
		String ct=Thread.currentThread().getName();
		
		try
		{
			for(int j=5;j>0;j--)
			{
				System.out.println(ct+":--"+j);
				Thread.sleep(1000);;
			}
		}
		catch(InterruptedException ie)
		{
			System.out.println(ct+" Thread Interrupted");
		}
		System.out.println(ct+" Thread terminated");
		
		
	}
}


