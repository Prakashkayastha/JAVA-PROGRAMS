
import java.util.*;
interface check
{
    void checkeven(int x);
    void checkodd(int x);
    void checkprime(int x);
    void checknotprime(int x);
    void checkpositive(int x);
    void checknegative(int x);
    void checkpalindrome(int x);
    void checknotpalindrome(int x);
    

}
class  Test implements check{
 
    public void checkeven(int x)
    {
        if(x%2 == 0)
        System.out.println(x +" is an even number");
    }
    public void checkodd(int x)
    {
        if(x % 2 != 0)
        System.out.println(x+" is an odd nuber");
    }
    public void checkprime(int x)
    {
        int flag=1;
        for(int i=2;i<x;i++)
        {
            if(x % i == 0)
            {
                flag =0;
                break;
            }
        }
        if(flag == 1)
        {
            System.out.println(x+" is a prime number");
        }

    }
    public void checknotprime(int x)
    {
        int flag=1;
        for(int i=2;i<x;i++)
        {
            if(x % i == 0)
            {
                flag =0;
                break;
            }
        }
        if(flag == 0)
        {
            System.out.println(x+" is not a prime number");
        }

    }
    public void checkpositive(int x)
    {
        if(x > 0)
        System.out.println(x+" is a positive number");
    }
    public void checknegative(int x)
    {
        if(x<0)
        System.out.println(x+" is a negative number");
    }
    public void checkpalindrome(int x)
    {
        int rev=0;
        int temp=x;
        while(temp > 0)
        {
            int rem=temp%10;
            rev = rev*10+rem;
            temp /= 10;
        }
        if(rev == x)
        System.out.println(x+" is a palindrome");

    }
    public void checknotpalindrome(int x)
    {
        int rev=0;
        int temp=x;
        while(temp > 0)
        {
            int rem=temp%10;
            rev = rev*10+rem;
            temp /= 10;
        }
        if(rev != x)
        System.out.println(x+" is not a palindrome");

    }
}
public class Classandobject2 {
   public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in);
    int num;
    System.out.println("Enter the number:");
    num=sc.nextInt();
    Test obj=new Test();
    obj.checkeven(num);
    obj.checkodd(num);
    obj.checkpositive(num);
    obj.checknegative(num);
    obj.checkpalindrome(num);
    obj.checknotpalindrome(num);
    obj.checkprime(num);
    obj.checknotprime(num);
   } 
}
