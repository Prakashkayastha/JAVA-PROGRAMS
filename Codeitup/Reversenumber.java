import java.util.Scanner;
class reverse{
    int n;
    void getdata(int i)
    {
        n=i;
    }
    int showdata()
    {
        int rev=0;
        while(n>0)
        {
            rev=rev*10 +(n%10);
            n /= 10;
        }
        return rev;
    }

}

public class Reversenumber {
    public static void main(String args[])
    {
        int n,res;
        Scanner sc=new Scanner(System.in);
        reverse rr= new reverse();
        System.out.println("Enter the number:");
        n=sc.nextInt();
        rr.getdata(n);
        res=rr.showdata();
        System.out.println("The reverse is:"+res);

    }
    
}
