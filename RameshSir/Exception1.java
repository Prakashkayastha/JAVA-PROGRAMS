package RameshSir;
import java.util.*;
public class Exception1 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        int a,b,res;
        System.out.println("Enter array elements:");
        for(int i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the two index:");
        a=sc.nextInt();
        b=sc.nextInt();
        try
        {
           try
           {
             res=arr[a]/arr[b];
             System.out.println("Result = "+res);
           }
           catch(ArrayIndexOutOfBoundsException ai)
           {
            System.out.println(ai);
            System.out.println("Entered index ig greater to size of an array,please enter valid index");
           }
        }
        catch(ArithmeticException ae)
        {
            System.out.println(ae);
            System.out.println("Denominator can't be zero:");
        }
    }
}
