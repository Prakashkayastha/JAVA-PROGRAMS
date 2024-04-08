import java.util.Scanner;
public class Elevenc {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        for(int i=23;i<=249;i++)
        {
            int flag=1;
            for(int j=2;j<i;j++)
            {
                if(i%j ==0)
                flag=0;
            }
            if(flag == 1)
            System.out.println(i);
        }
    }
}
