import java.util.Scanner;
public class Seven {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int choice;
        int number;
        System.out.println("Enter the number of factorial:");
        number=sc.nextInt();
        System.out.println("Using while loop Enter 1:");
        System.out.println("Using do while loop Enter 2:");
        System.out.println("Using for loop Enter 3:");
        choice =sc.nextInt();
        int ans=1;
         switch(choice)
         {
            case 1:
            {
                int temp=number;
                while(temp > 0)
                {
                    ans *= temp;
                    temp--;
                }
                System.out.println(ans);

            }
            break;
            case 2:
            {
                int temp=number;
                do{
                    ans *= temp;
                    temp--;
                }while(temp>0);

                System.out.println(ans);
            }
            break;
            case 3:
            {
                int temp=number;
                for(int i=1;i<=temp;i++)
                {
                    ans *= i;
                }

                System.out.println(ans);
            }
         }
        
    }
}
