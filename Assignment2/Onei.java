
import java.util.Scanner;
public class Onei {
    
     public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int number;
        System.out.println("Enter the number:");
        number=sc.nextInt();
        int temp=number;
        int sum=0;
        while(temp > 0)
        {
            sum += temp%10;
            temp /= 10;
        }
        System.out.println("Sum of digits="+sum);
    }
}
