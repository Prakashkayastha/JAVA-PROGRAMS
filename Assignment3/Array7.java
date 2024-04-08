package Assignment3;
import java.util.Scanner;
public class Array7 {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int mat[][]=new int[3][4];
      int res[][]=new int[4][3];
      System.out.println("Enter the matrix elements:");
      for(int i=0;i<3;i++)
      {
        for(int j=0;j<4;j++)
        {
            mat[i][j]=sc.nextInt();
        }
      }
      for(int i=0;i<3;i++)
      {
        for(int j=0;j<4;j++)
        {
            res[j][i]=mat[i][j];
        }
      }
      System.out.println("The entered matrix is:");
      for(int i=0;i<3;i++)
      {
        for(int j=0;j<4;j++)
        {
            System.out.print(mat[i][j]+" ");
        }
        System.out.println("\n");
      }
       System.out.println("\n");
       System.out.println("The transpose of the matrix is:");
      for(int i=0;i<4;i++)
      {
        for(int j=0;j<3;j++)
        {
            System.out.print(res[i][j]+" ");
        }
        System.out.println("\n");
      }

    }
}
