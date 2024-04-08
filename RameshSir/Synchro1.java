//package RameshSir;
import java.util.*;
class PrinterD
{
	synchronized void printmsg(String msg)
	{
		System.out.print("[");
		try
		{
			System.out.print(msg);
			Thread.sleep(500);
		}
		catch(InterruptedException ie)
		{
			System.out.println("Thread Interrupted");
		}
		System.out.print("]");
	}
}
class Tests implements Runnable
{
	Thread t;String tnm,msg;
	PrinterD p;
	Tests(String nm,String m,PrinterD p1)
	{
		tnm=nm;
		msg=m;
		p=p1;
		t=new Thread(this,tnm);
		t.start();
		
	}
	public void run()
	{
		p.printmsg(msg);
	}
}
class Synchro1
{
	public static void main(String args[]) {
		PrinterD pd=new PrinterD();
		Tests t1=new Tests("c1","Hello",pd);
		Tests t2=new Tests("c2","World",pd);
		Tests t3=new Tests("c3","Synchronization",pd);
		try
		{
			Thread.sleep(1000);
			t1.t.join();
			t2.t.join();
			t3.t.join();
		}
		catch(InterruptedException ie)
		{
			System.out.println("Main Interrupted");
		}
		
	}
}


