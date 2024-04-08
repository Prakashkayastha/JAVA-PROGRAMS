import javax.swing.*;
class FirstName implements Runnable
{
	String fn;
	FirstName(String a)
	{
		fn=a;
	}
	public void run()
	{
		System.out.println(fn+" ");
	}
}
class LastName implements Runnable
{
	String ln;
	LastName(String b)
	{
		ln=b;
	}
	public void run()
	{
		System.out.println(ln);
	}
	
}
class Q8
{
	public static void main(String args[])
	{
		String fn,ln;
		fn=JOptionPane.showInputDialog("Enter the first name:");
		ln=JOptionPane.showInputDialog("Enter the second name:");
		FirstName firstname=new FirstName(fn);
		LastName lastname =new LastName(ln);
		Thread printfirts = new Thread(firstname);
		Thread printlast = new Thread(lastname);
		printfirts.start();
		printlast.start();
		
	}
}
