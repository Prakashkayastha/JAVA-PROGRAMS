import java.util.Scanner;
public class Nine {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num1,num2,num3;
        System.out.println("Enter the first number:");
        num1=sc.nextInt();
        System.out.println("Enter the second number:");
        num2=sc.nextInt();
        System.out.println("Enter the third number:");
        num3=sc.nextInt();
        int mini,maxi;
        if(num1>num2 && num1>num3)
        maxi=num1;
        else if(num2>num1 && num2>num3)
        maxi=num2;
        else 
        maxi=num3;


        if(num1<num2 && num1<num3)
        mini=num1;
        else if(num2<num1 && num2<num3)
        mini=num2;
        else 
        mini=num3;
        int diff;
        int fact1=1,fact2=1;
        for(int i=1;i<=maxi;i++)
        {
            fact1 *= i;
        }
        for(int i=1;i<=mini;i++)
        {
            fact2 *= i;
        }
        diff=fact1-fact2;
        System.out.println("The difference is = "+diff);
    }
}
