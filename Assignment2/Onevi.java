
import java.util.Scanner;
import java.lang.Math;
public class Onevi {
    
    public static void main(String args[])
    {
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int temp=number;
        int k,count=0,flag=0;
        System.out.println("Enter the position for element from which you find:");
        k=sc.nextInt();

        while(temp>0)
        {
            int rem=temp%10;
            count++;
            if(count == k)
            {
               System.out.println("Digit is:"+rem);
               System.out.println("Its positional value is:"+ rem *Math.pow(10,count-1));
               break;
            }
            temp /= 10;
        }
        
    }
}
