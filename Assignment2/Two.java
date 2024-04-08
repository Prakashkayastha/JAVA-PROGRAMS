import java.util.Scanner;
public class Two {
    public static void main(String args[])
    {
        int num1,num2,digit=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        num1=sc.nextInt();
        System.out.println("Enter the second number:");
        num2=sc.nextInt();
        int temp=num1;
        while(temp>0)
        {
            digit++;
            temp /= 10;
        }
        int sum=0;
        int temp1=num1;
        int temp2=num2;
        while(digit>0)
        {
           int rem1=temp1%10;
           int rem2=temp2%10;
           sum += rem1*rem2;
           temp1 /= 10;
           temp2 /= 10;
           digit--;
        }
        System.out.println(sum);
    }
}
