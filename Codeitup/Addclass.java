import java.util.Scanner;
public class Addclass {
    
    int a,b;
    void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number:");
        a=sc.nextInt();
        System.out.println("Enter second number:");
        b=sc.nextInt();
    }
    void showdata()
    {
        System.out.println("Addition of two number is:"+(a+b));
    }
    public static void main(String args[])
    {
        Addclass aa=new Addclass();
        aa.getdata();
        aa.showdata();
    }
}
