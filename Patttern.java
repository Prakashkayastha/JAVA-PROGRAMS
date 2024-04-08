import java.util.Scanner;
public class Patttern{
    public static void main(String[] args) {
        int fib1=0,fib2=1,fib,lim;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total number:");
        lim=sc.nextInt();
        System.out.println(fib1);
        System.out.println(fib1);
        for(int i=1;i<=lim-2;i++)
        {
            fib=fib1+fib2;
            System.out.println(fib);
            fib1=fib2;
            fib2=fib;
        }
    }
}