
import java.util.*;
class BANK
{
	double r;
	BANK(double r)
	{
		this.r=r;
	}
	void findSI()
	{
		System.out.println("Parent class BANK");
	}
}
class RBI extends BANK
{
	int p,t;
	double r;
	RBI(int p,int t,double r)
	{
		super(r);
		this.p=p;
		this.t=t;
		this.r=r;
	}
	void findSI()
	{
		System.out.println("Simple Intrest of rbi is:"+(p*t*r)/100);
	}
}
class SBI extends BANK
{
	int p,t;
	double r;
	SBI(int p,int t,double  r)
	{
		super(r);
		this.p=p;
		this.t=t;
		this.r=r;
	}
	void findSI()
	{
		System.out.println("Simple Intrest of sbi is:"+(p*t*r)/100);
	}
}
class HDFC extends BANK
{
	int p,t;
	double r;
	HDFC(int p,int t,double  r)
	{
		super(r);
		this.p=p;
		this.t=t;
		this.r=r;
		
	}
	void findSI()
	{
		System.out.println("Simple Intrest of hdfc is:"+(p*t*r)/100);
	}
}
class MethodandDynamic
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		RBI rb=new RBI(100,5,10);
		SBI sb=new SBI(100,5,10);
		HDFC hd=new HDFC(300,4,5);
		BANK ref;
		ref=rb;
		ref.findSI();
//		ref=sb;
//		ref.findSI();
//		ref=hd;
//		ref.findSI();
		// BANK b=new BANK(5);
		// b.findSI();
		
	}
}
