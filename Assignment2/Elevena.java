import java.util.Scanner;
public class Elevena {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        

        for(int i=23;i<=249;i++)
        {
            if(i%2 == 0)
            {
                int unit=i%10;
                if(unit == 4 || unit == 0)
                System.out.println(i);
            }
        }
    }
}
