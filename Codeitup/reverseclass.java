import java.util.Scanner;
public class reverseclass {
    int n;
    void getdata(int i)
    {
        n=i;
    }
    void showdata()
    {
        int rev=0;
        while(n>0)
        {
            rev = rev*10 + (n%10);
            n /= 10;
        }
        System.out.println("Reverse of given number is:"+ rev);
    }

    public static void main(String args[])
    {
        reverseclass rr=new reverseclass();
        rr.getdata(145);
        rr.showdata();
    }
}
