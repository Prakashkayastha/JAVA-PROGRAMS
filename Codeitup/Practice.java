
import java.util.*;
class Practice
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter the number:");
		num=sc.nextInt();
		int x=0;
		int start=2;
		int end=num-start;
		while(start <= end)
		{
			if(isprime(start) && isprime(end))
            {
				System.out.println(num+" = "+start+"+"+end);
				x=1;
				break;
			}
			start++;
			end--;
		}
		if(x == 0)
		System.out.println("Given number can't be the sum of two prime number");
	}
	public static boolean isprime(int n)
	{
		for(int i=2;i<n;i++)
		{
			if(n % i == 0)
			return false;
		}
		return true;
	}

}


