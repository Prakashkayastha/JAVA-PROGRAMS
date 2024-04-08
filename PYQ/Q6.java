class Invalidnumberexception extends Exception
{
	int num;
	public Invalidnumberexception(int a)
	{
		num=a;
	}
	public String tostring()
	{
		String msg="Given number is either not a palindrome or not divisible by 3 and 5";
		return msg;
	}
}
interface Checkdetails
{
	boolean checkpalindrome();
	boolean checkdivision();
}
class Numbercheck implements Checkdetails
{
	int number;
	Numbercheck(int number)
	{
		this.number=number;
	}
	public boolean checkpalindrome()
	{
		int rev=0;
		int temp=number;
		while(temp > 0)
		{
			int rem=temp%10;
			rev = rev*10 + rem;
			temp /= 10;
		}
		if(number == rev)
			return true;
		else
		    return false;
	}
	public boolean checkdivision()
	{
		if(number % 3 == 0 && number %5 ==0)
			return true;
		else
			return false;
	}
}
public class Q6 {
     public static void main(String args[])
   {
		Numbercheck obj=new Numbercheck(151);
		try
		{
			if(obj.checkpalindrome() && obj.checkdivision())
			{
			   System.out.println("Given number satisfied both the conditions:");	
			}
			else
			{
				throw new Invalidnumberexception(151);
			}
			
		}
		
		catch(Invalidnumberexception ie)
		{
            System.out.println("Condition declined");
			System.out.println(ie);
		}
   }
}
