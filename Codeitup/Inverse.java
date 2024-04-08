import java.util.Scanner;
public class Inverse {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[3][3];
        int b[][]=new int[3][3];
        double r[][]=new double[3][3];
        System.out.println("Enter the 3x3 matrix elements:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
               a[i][j]=sc.nextInt();
            }
        }
       int det=a[0][0] * ((a[1][1]*a[2][2]-a[1][2]*a[2][1])) -a[0][1] * (a[1][0]*a[2][2] - a[1][2]*a[2][0]) + a[0][2] * (a[1][0]*a[2][1] - a[1][1]*a[2][0]);
        b[0][0]=a[1][1]*a[2][2] - a[1][2]*a[2][1];
        b[0][1]=-(a[1][0]*a[2][2] - a[1][2]*a[2][0]);
        b[0][2]=a[1][0]*a[2][1] - a[1][1]*a[2][0];
        b[1][0]=-(a[0][1]*a[2][2] - a[0][2]*a[2][1]);
        b[1][1]=a[0][0]*a[2][2] - a[0][2]*a[2][0];
        b[1][2]=-(a[0][0]*a[2][1] - a[0][1]*a[2][0]);
        b[2][0]=a[0][1]*a[1][2] - a[1][1]*a[0][2];
        b[2][1]=-(a[0][0]*a[1][2] - a[0][2]*a[1][0]);
        b[2][2]=a[0][0]*a[1][1] - a[1][0]*a[0][1];


         for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
              System.out.print(a[i][j]+" ");
            }
            System.out.println("\n");
        }

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                r[i][j]=(b[i][j] / det);
            }
        }

         for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
              System.out.print(b[i][j]+" ");
            }
            System.out.println("\n");
        }

         for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
              System.out.print(r[i][j]+" ");
            }
            System.out.println("\n");
        }





    }
}
