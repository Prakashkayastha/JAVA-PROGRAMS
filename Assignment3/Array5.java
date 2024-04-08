package Assignment3;
import java.util.*;
public class Array5 {
    public static void addition(int mat1[][],int mat2[][],int res1[][])
    {
       for(int i=0;i<3;i++)
       {
        for(int j=0;j<4;j++)
        {
            res1[i][j]=mat1[i][j]+mat2[i][j];
        }
       }
    }

    public static void substraction(int mat1[][],int mat2[][],int res2[][])
    {
       for(int i=0;i<3;i++)
       {
        for(int j=0;j<4;j++)
        {
            res2[i][j]=mat1[i][j]-mat2[i][j];
        }
       }
    }

    public static void multiplication(int mat1[][],int mat2[][],int res3[][])
    {
      for(int i=0;i<3;i++)
      {
        for(int j=0;j<4;j++)
        {
            int sum=0;
            for(int k=0;k<3;k++)
            {
               sum += mat1[i][k]*mat2[k][j];
            }
            res3[i][j]=sum;
        }
      }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int mat1[][]=new int[3][4];
        int mat2[][]=new int[3][4];
        int res1[][]=new int[3][4];
        int res2[][]=new int[3][4];
        int res3[][]=new int[3][4];
        System.out.println("Enter 1st matrix elements:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                mat1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter 2nd matrix elements:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                mat2[i][j]=sc.nextInt();
            }
        }
        addition(mat1,mat2,res1);
        System.out.println("Addition of two matrix: \n");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(res1[i][j]+" ");
            }
            System.out.println("\n");
        }
        substraction(mat1,mat2,res2);
        System.out.println("Substraction of two matrix: \n");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(res2[i][j]+" ");
            }
            System.out.println("\n");
        }
        multiplication(mat1,mat2,res3);
        System.out.println("Multiplication of two matrix: \n");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(res3[i][j]+" ");
            }
            System.out.println("\n");
        }



    }
}
