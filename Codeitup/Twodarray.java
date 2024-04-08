import java.util.Scanner;
class Printarray{
   int a[][]=new int[10][10];
   int m,n;
   Printarray(int r,int c)
   {
    m=r;
    n=c;
   }
    
   
    void assign(int arr[][])
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=arr[i][j];
            }
        }
    }
    void print()
    {
         for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
               System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
public class Twodarray {
    public static void main(String args[])
    {
        int r,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows:");
        r=sc.nextInt();
        System.out.println("Enter number of column:");
        c=sc.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("Enter the 2d array elements:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        Printarray obj=new Printarray(r,c);
        obj.assign(arr);
        obj.print();
    }
}
