import java.util.Scanner;
class mat{
    int a[][]=new int[10][10];
    int b[][]=new int[10][10];
    int c[][]=new int[10][10];
    int m1,n1,m2,n2;
    mat(int r1,int c1,int r2,int c2)
    {
        m1=r1;
        n1=c1;
        m2=r2;
        n2=c2;
    }
   
    void assign(int arr1[][],int arr2[][])
    {
        for(int i=0;i<m1;i++)
        {
            for(int j=0;j<n1;j++)
            {
                a[i][j]=arr1[i][j];
            }
        }

         for(int i=0;i<m2;i++)
        {
            for(int j=0;j<n2;j++)
            {
                b[i][j]=arr2[i][j];
            }
        }
    }
    void mult()
    {
        for(int i=0;i<m1;i++)
        {
            for(int j=0;j<n1;j++)
            {
                int sum=0;
                for(int k=0;k<m1;k++)
                {
                    sum=sum+a[i][k]*b[k][j];
                }
                c[i][j]=sum;
            }
        }
        System.out.println("The resultant matris is:");
         for(int i=0;i<m1;i++)
        {
            for(int j=0;j<n2;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }

    
   
   

}
public class  Matmult {
    public static void main(String[] args) {
        int r1,c1,r2,c2;
        Scanner sc=new Scanner(System.in);
        System.out.println("1st matrix row:");
        r1=sc.nextInt();
        System.out.println("1st matrix column:");
        c1=sc.nextInt();
        System.out.println("2nd matrix row:");
        r2=sc.nextInt();
        System.out.println("2nd matrix column:");
        c2=sc.nextInt();
        if(c1!=r2)
        System.out.println("Multiplication can't possible");
        else{
            int arr1[][]=new int[r1][c1];
            int arr2[][]=new int[r2][c2];
        System.out.println("Enter 1st matrix element:");
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                arr1[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter 2nd matrix element:");
        for(int i=0;i<r2;i++)
        {
            for(int j=0;j<c2;j++)
            {
                arr2[i][j]=sc.nextInt();
            }
        }
        mat obj=new mat(r1,c1,r2,c2);
        obj.assign(arr1,arr2);
        obj.mult();

        }
       
        
    }
}


