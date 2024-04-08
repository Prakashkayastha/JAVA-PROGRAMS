import java.util.Scanner;
public class Switchcase {
    public static void main(String[] args) {
        int a,b,ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st number:");
        a=sc.nextInt();
        System.out.println("Enter 2nd number:");
        b=sc.nextInt();
        System.out.println("Enetr your choice: 1->Add 2-> Substract 3-> Multiplication 4-> Division");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
            System.out.println("Addition="+(a+b));
            break;
            case 2:
            System.out.println("Substraction="+(a-b));
            break;
            case 3:
           System.out.println("Multiplication ="+(a*b));
           break;
           case 4:
           System.out.println("Division="+(a/b));
           break;
           default:
           System.out.println("Invalid Choice");

        }
    }
}
