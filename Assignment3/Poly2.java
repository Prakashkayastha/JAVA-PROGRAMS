//package Assignment3;
import java.util.*;
class Box{
    int even;
    double odd;
    char ch;
    Box()
    {
        even=2;
        odd=3;
        ch='k';
    }
     Box(int even,double odd,char ch)
     {
         this.even=even;
         this.odd=odd;
         this.ch=ch;
     }
    //1st
    void printpyramid(int x)
    {
        even=x;
      for(int i=1;i<=4;i++)
       {
         for(int j=1;j<=4-i;j++)
         {
            System.out.print(" ");
         }
         for(int k=1;k<=i;k++)
         {
           if(k == 1)
           {
            System.out.print(even+(2*i)+" ");
            x=even+(2*i);
           }
           else
           {
            System.out.print(x+(2*(i-1)*(k-1))+" ");
           }
         }
         System.out.print("\n");
       }
    }
    //2nd
    void printpyramid(double y)
    {
        odd=y;
        int od=(int)odd;
      for(int i=1;i<=4;i++)
       {
         for(int j=1;j<=4-i;j++)
         {
            System.out.print(" ");
         }
         for(int k=1;k<=i;k++)
         {
            System.out.print(od+k*(2*i-1)+" ");
         }
         
         System.out.print("\n");
       }
    }
    //3rd
    void printpyramid(char c)
    {
        ch=c;
          for(int i=1;i<=4;i++)
         {
         for(int j=1;j<=4-i;j++)
         {
            System.out.print(" ");
         }
         for(int k=1;k<=i;k++)
         {
            System.out.print(ch+" ");
         }
         System.out.print("\n");
         }
    }
       
}
public class Poly2{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Box obj=new Box(2,3,'k');
        int even=0;
        double odd=0;
        char ch='k';
        System.out.println("Enter the even number to print the pyramid:");
        even=sc.nextInt();
         System.out.println("Enter the odd number to print the pyramid:");
        odd=sc.nextDouble();
        System.out.println("Enter the character:");
        ch=sc.next().charAt(0);
        obj.printpyramid(even);
        System.out.println("\n");
        obj.printpyramid(odd);
         System.out.println("\n");
        obj.printpyramid(ch);

    }
}
