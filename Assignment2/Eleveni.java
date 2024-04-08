import java.util.Scanner;
public class Eleveni {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int count1=0,count2=0;
        for(int i=249;i>=23;i--)
        {
           if(i%2 == 0)
           {
            System.out.println(i);
            count1++;
           }
           if(count1>4)
           break;
        }

        for(int i=23;i<=249;i++)
        {
            if(i%2 != 0)
            {
                System.out.println(i);
                count2++;
            }
            if(count2>4)
            break;
        }
    }
}
