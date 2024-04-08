import java.util.Scanner;
public class Primeclass {
    int num;
    void getdata(int i)
    {
        num=i;
    }
    boolean showdata()
    {
        int flag=0;
        for(int i=2;i<num;i++)
        {
            if(num % i == 0)
            flag=1;
        }
        if(flag == 1)
        return true;
        else
        return false;

    }
    public static void main(String args[])
    {
        int num;
        Primeclass pp=new Primeclass();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        num=sc.nextInt();
        pp.getdata(num);
        boolean res=pp.showdata();
        if(res)
        System.out.println("Given number is not a prime number");
        else
        System.out.println("Given number is  a prime number");



    }
}

