import java.util.Scanner;
public class Oddevensum {
    public static void main(String[] args) {
        int num;
        int evensum=0;
        int oddsum=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        num=sc.nextInt();
        while(num>0)
        {
            int rem1=num%10;
            if(rem1 %2 ==0)
            evensum += rem1;
            else
            oddsum *= rem1;
            num /= 10;
        }
         
        System.out.println("Even number sum="+evensum);
        System.out.println("Odd number sum="+oddsum);
    }
}
