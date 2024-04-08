//package RameshSir;
import java.util.*;
class Testthread extends Thread
{
	String tnm;
	Thread t;
	int a,b,c;
	Testthread(String nm,int d,int e)
	{
		tnm=nm;
		a=d;
		b=e;
		t=new Thread(this,tnm);
		System.out.println("Thread in cpu:-"+Thread.currentThread());
		if(tnm.equals("sum"))
		t.setPriority(9);
		if(tnm.equals("mult"))
		t.setPriority(8);
		if(tnm.equals("sub"))
		t.setPriority(7);
		t.start();
	}
	public void run()
	{
		String ct=Thread.currentThread().getName();
		System.out.println("Thread in cpu:-"+Thread.currentThread());
		try
		{
			if(ct.equals("sum")) {
				c=a+b;
				System.out.println("Sum of "+a+" and "+b+"is "+c);
				Thread.sleep(1000);
			}
			if(ct.equals("mult"))
			{
				c=a*b;
				System.out.println("Multiplication of "+a+"and "+b+"is "+c);
				Thread.sleep(1000);
			}
			if(ct.equals("sub"))
			{
				c=a-b;
				System.out.println("Substraction of "+a+" and "+b+"is "+c);
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
class Multithread2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=0,b=0,c=0;
		System.out.println("Enter two numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		Testthread t1=new Testthread("sum",a,b);
		Testthread t2=new Testthread("mult",a,b);
		Testthread t3=new Testthread("sub",a,b);
		System.out.println("Before Execution");
		System.out.println("Thread one is alive:-"+t1.t.isAlive());
		System.out.println("Thread two is alive:-"+t2.t.isAlive());
		System.out.println("Thread three is alive:-"+t3.t.isAlive());
		String ct=Thread.currentThread().getName();
		try
		{
			Thread.sleep(1000);
			t1.t.join();
			t2.t.join();
			t3.t.join();
		}
		catch(InterruptedException ie)
		{
			System.out.println(ct+" Thread Interrupted");
		}
		System.out.println(ct+ "Thread Terminated");
		System.out.println("After Executiom");
		System.out.println("Thread One is  Alive-"+t1.t.isAlive());
		System.out.println("Thread Two is  Alive-"+t2.t.isAlive());
		System.out.println("Thread Three is  Alive-"+t3.t.isAlive());
		
		
	}
}



