import java.util.Scanner;
class mat{
    int a[][]=new int[10][10];
    int b[][]=new int[10][10];
    int c[][]=new int[10][10];
    int m,n;
    mat(int r,int c)
    {
        m=r;
        n=c;
    }
    void assign(int arr1[][],int arr2[][])
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=arr1[i][j];
                b[i][j]=arr2[i][j];
            }
        }
    }
    void sum()
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
               c[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("Addition matrix is:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }

    }
    void sub()
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
               c[i][j]=a[i][j]-b[i][j];
            }
        }
        System.out.println("Substraction of  matrix is:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }

    }
    
}
public class Addsubmat {
    public static void main(String[] args) {
        int r,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row size:");
        r=sc.nextInt();
        System.out.println("Enter column size:");
        c=sc.nextInt();
        int arr1[][]=new int [r][c];
        int arr2[][]=new int[r][c];
        System.out.println("Enter 1st matrix elements:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
               arr1[i][j]=sc.nextInt();
            }
            
        }
         System.out.println("Enter 2nd matrix elements:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
               arr2[i][j]=sc.nextInt();
            }
            
        }
        mat obj =new mat(r,c);
        obj.assign(arr1,arr2);
        obj.sum();
        obj.sub();
    }
    
}
