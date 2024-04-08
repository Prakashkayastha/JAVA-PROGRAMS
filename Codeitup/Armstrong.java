import java.util.Scanner;
import java.lang.Math;
public class Armstrong {
    public static void main(String[] args) {
        int num,var=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        num=sc.nextInt();
        int check=num;
        for(int i=1;i<=3;i++)
        {
            var += Math.pow((num%10),3);
            num /= 10;
        }
        if(var == check)
        System.out.println("Armstrong number");
        else
        System.out.println("Not an armstropng");
    }
}
