
import java.util.Scanner;
public class Oneiv {
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int number,flag;
        System.out.println("Enter the number:");
        number=sc.nextInt();
        int temp=number;
        int sum=0;
        while(temp > 0)
        {
            flag=0;
            int rem=temp%10;
            for(int i=2;i<rem;i++)
            {
                if(rem%i == 0)
                flag =1;
            }
            if(flag == 0)
            {
              sum += rem;
            }
            temp /= 10;
        }
        System.out.println("Sum of digits="+sum);
    }
}
