import java.util.Scanner;
import java.lang.Math;
public class Power {
    public static void main(String args[]){
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        a=sc.nextInt();
        System.out.println("Enter the second number:");
        b=sc.nextInt();
        double res=Math.pow(a, b);
        System.out.println("Result="+res);

    }
    
}
