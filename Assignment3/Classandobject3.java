package Assignment3;
import java.util.*;
interface shape
{
    int findperemeter();
    int findarea();
}
class rectangle implements shape
{
   int length;
   int breadth;
   rectangle(int length,int breadth)
   {
    this.length=length;
    this.breadth=breadth;
   }

   public int findperemeter()
   {
    return 2*(length+breadth);
   }
  public  int findarea()
   {
     return length*breadth;
   }
}
 class Classandobject3 {
     
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length and breadth of the rectangle:");
        int l=sc.nextInt();
        int b=sc.nextInt();
        rectangle obj=new rectangle(l,b);
        int res1=obj.findperemeter();
        int res2=obj.findarea();
        System.out.println("Peremeter of rectangle = "+res1);
        System.out.println("Area of rectangle = "+res2);

    }
}
