import java.util.Scanner;
public class Prime {
    public static void main(String args[])
    {
        int num,range,j;
       
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the range:");
        range=sc.nextInt();
        for(int i=1;i<=range;i++)
        {
            num=i;
            for( j=2;j<num;j++)
            {
                if(num % j ==0)
                break;
            }
            if(num == j)
            System.out.println(num);

        }
        


    }
}
