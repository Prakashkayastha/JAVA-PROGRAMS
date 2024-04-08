package Assignment3;
import java.util.*;
class Numberorstring
{
    int number;
    String str;
    boolean checkpalindrome(int num)
    {
        number=num;
        int rev=0,temp=number;
        while(temp >0)
        {
            int rem=temp%10;
            rev =rev*10 + rem;
            temp /= 10;
        }
        if(number == rev)
        return true;
        else
        return false;
    }
    boolean checkpalindrome(String st)
    {
       str=st;
       String rev="";
       int s=0,e=str.length()-1;
       while(s<e)
       {
        if(str.charAt(s) != str.charAt(e))
        return false;
        s++;
        e--;
       }
       return true;
    }

}
public class Poly6 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Numberorstring obj=new Numberorstring();
       System.out.println("Enter a number:");
       int num=sc.nextInt();
       String str;
       System.out.println("Enter the string:");
       str=sc.next();
       if(obj.checkpalindrome(num))
       System.out.println("Given number is a palindrome");
       else
       System.out.println("Not palindrome");

       if(obj.checkpalindrome(str))
       System.out.println("Given string is a palindrome");
       else
       System.out.println("Not palindrome");


    }
}
