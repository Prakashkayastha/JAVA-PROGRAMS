/*Program to find sum of product of corresponding even digits and sum of product of corresponding odd digits */
//package PYQ;
import java.util.*;
public class Q1 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter the two number:");
        num1=sc.nextInt();
        num2=sc.nextInt();
        int temp1=num1;
        int temp2=num2;
        int res=0;
        while(temp1 > 0 && temp2 > 0)
        {
            int rem1=temp1%10;
            int rem2=temp2%10;
            if(rem1%2 == 0 && rem2%2 != 0)
            {
               res += rem1*rem2;
               temp1 /= 10;
               temp2 /= 10;
            }
            // else if( rem1%2 == 0 && rem2%2 == 0)
            // {
            //     temp2 /= 10;
            // }
            // else if(rem1%2 !=0 && rem2%2 !=0)
            // {
            //     temp1 /= 10;
            // }
            else
            {
                temp1 /= 10;
                temp2 /=10;
            }
        }
        System.out.println(res);
    }
}
