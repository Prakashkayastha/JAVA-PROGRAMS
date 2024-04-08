import java.util.Scanner;
public class Numbermax {
    public static void main(String[] args) {
        int num1,num2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number:");
        num1=sc.nextInt();
        System.out.println("Enter second number;");
        num2=sc.nextInt();
        if(num1 > num2)
        System.out.println("Num1 is greater than Num2");
        else
        System.out.println("Num2 is greater than Num1");

    }
    
}
