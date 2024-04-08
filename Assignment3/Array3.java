package Assignment3;
import java.util.*;
public class Array3 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        System.out.println("Enter array elements:");
        for(int i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<10;i++)
        {
            for(int j=i+1;j<10;j++)
            {
                if(arr[i] > arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Sum of product of  2nd smallest number and 3rd largets number="+arr[1]*arr[7]);
    }
}
