package Assignment3;
import java.util.*;
public class Array2 {
    public static boolean present(int arr[],int target)
    {
        for(int i=0;i<10;i++)
        {
            if(arr[i] == target)
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        System.out.println("Enter array elements:");
        for(int i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();
        }
        int target;
        int leftsum=0,leftcount=0,rightsum=0,rightcount=0;
        System.out.println("Enter the checking number:");
        target=sc.nextInt();
        if(present(arr,target))
        {
            for(int i=0;i<10;i++)
            {
                if(arr[i] == target)
                break;
                leftsum += arr[i];
                leftcount++;
            }
            for(int i=9;i>=0;i--)
            {
                if(arr[i] == target)
                break;
                rightsum += arr[i];
                rightcount++;
            }
        }
        else
        {
            arr[5]=target;
             for(int i=0;i<10;i++)
            {
                if(arr[i] == target)
                break;
                leftsum += arr[i];
                leftcount++;
            }
            for(int i=9;i>=0;i--)
            {
                if(arr[i] == target)
                break;
                rightsum += arr[i];
                rightcount++;
            }
        }
        System.out.println("Average of left side elements:"+leftsum/leftcount);
        System.out.println("Average of right side elements:"+rightsum/rightcount);
    }
}
