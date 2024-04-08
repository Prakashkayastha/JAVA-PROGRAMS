//package RameshSir;
import java.util.*;
class Testthread extends Thread
{
	Thread t;
	String tnm,r1,r2;
	Testthread(String nm,String m1,String m2)
	{
		tnm=nm;
		r1=m1;
		r2=m2;
		t=new Thread(this,tnm);
		t.start();
	}
	public void run()
	{
		String ct=Thread.currentThread().getName();
		try
		{
			if(ct.equals("T1"))
			{
				System.out.println(ct+"Make a request for resource 1");
				synchronized(r1)
				{
					System.out.println(ct+"has resource1.value "+r1);
					Thread.sleep(500);
				}
				System.out.println(ct+"Make a request for resource 2");
				synchronized(r2)
				{
					System.out.println(ct+"has resource2.value"+r2);
					Thread.sleep(500);
				}
			}
			
			if(ct.equals("T2"))
			{
				System.out.println(ct+"Make a request for resource 2");
				synchronized(r2)
				{
					System.out.println(ct+"has resource1.value "+r2);
					Thread.sleep(500);
				}
				System.out.println(ct+"Make a request for resource 1");
				synchronized(r1)
				{
					System.out.println(ct+"has resource2.value"+r1);
					Thread.sleep(500);
				}
			}
			
			
		}
		catch(InterruptedException ie)
		{
			System.out.println("Thread Interrupted");
		}
		System.out.println("Thread terminated Succesfully");
	}
}
class Deadlock1
{
	public static void main(String args[])
	{
		final String m1="JAVA";
		final String m2="Programming";
		Testthread t1=new Testthread("T1",m1,m2);
		Testthread t2=new Testthread("T2",m1,m2);
		try
		{
			Thread.sleep(1000);
			t1.t.join();
			t2.t.join();
		}
		catch(InterruptedException ie)
		{
			System.out.println("Main thread Interrupted");
		}
		System.out.println("Program terminated succesfully");
		
	}
}




