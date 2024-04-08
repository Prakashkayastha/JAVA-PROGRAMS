/*Write a program to find average and also find total no. of odd, even, prime and palindrome
number available in an array of 30 user defined numbers?*/
package Assignment3;
import java.util.*;
public class Array1 {
  
     public static boolean checkprime(int x)
     {
        for(int i=2;i<x;i++)
        {
            if(x%i == 0)
            return false;
        }
        return true;
     }
     public static boolean checkpalindrome(int x)
     {
        int rev=0;
        int temp=x;
        while(temp > 0)
        {
            int rem=temp%10;
            rev = rev*10 +rem;
            temp /= 10;
        }
        if(rev == x)
        return true;
        else 
        return false;

     }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[30];
        System.out.println("Enter array elements:");
        for(int i=0;i<30;i++)
        {
            arr[i]=sc.nextInt();
        }
        int oddcount=0,oddsum=0,evencount=0,evensum=0,primecount=0,primesum=0,palindrome_count=0,palindrome_sum=0;
        //Even work and odd work
        for(int i=0;i<30;i++)
        {
            if(arr[i] % 2 == 0)
            {
                evensum += arr[i];
                evencount++;
            }
            else
            {
               oddsum += arr[i];
               oddcount++;
            }
        }
       //Prime work
       for(int i=0;i<30;i++)
       {
         if(checkprime(arr[i]))
         {
            primesum += arr[i];
            primecount++;
         }
       }
       //Palindrome work
       for(int i=0;i<30;i++)
       {
        if(checkpalindrome(arr[i]))
        {
            palindrome_sum += arr[i];
            palindrome_count++;
        }
       }
       System.out.println("Total number of odd number = "+oddcount+"\n"+"Odd number sum = "+oddsum+"\n"+"Average of odd number = "+oddsum/oddcount);
       System.out.println("Total number of even number = "+evencount+"\n"+"even number sum = "+evensum+"\n"+"Average of even number = "+evensum/evencount);
       System.out.println("Total number of prime number = "+primecount+"\n"+"prime number sum = "+primesum+"\n"+"Average of prime number = "+primesum/primecount);
       System.out.println("Total number of palindrome number = "+palindrome_count+"\n"+"palindrome number sum = "+palindrome_sum+"\n"+"Average of palindrome sum = "+palindrome_sum/palindrome_count);

    }
}
