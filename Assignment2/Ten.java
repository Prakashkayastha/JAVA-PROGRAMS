import java.util.Scanner;
public class Ten {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int term;
        System.out.println("Enter the number of terms:");
        term=sc.nextInt();
        int fib1=0,fib2=1;
        System.out.println(fib1);
        System.out.println(fib2);
        for(int i=1;i<=term-2;i++)
        {
           int fib3=fib1+fib2;
           System.out.println(fib3);
           fib1=fib2;
           fib2=fib3;
        }
    }
}
