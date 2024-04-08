//package Assignment3;
import java.util.*;
abstract class Searcharray
{
    abstract void linsearch(int arr[],int key);
    abstract void binsearch(int arr[],int key);
    abstract void sort(int arr[]);
}
class Arr extends Searcharray
{
    void sort(int arr[])
    {
        for(int i=0;i<20;i++)
        {
            for(int j=i+1;j<20;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    void  linsearch(int arr[],int k)
    {
        int index=0;
        boolean flag=false;
        for(int i=0;i<20;i++)
        {
           if(arr[i] == k)
           {
            index=i;
            flag=true;
            break;
           }

        }
        if(flag)
        System.out.println("Search element is present at index:"+index);
        else
        System.out.println("The element which you want to search is not present in this array");

    }
    void binsearch(int arr[],int key)
    {
        int index=0;
        boolean flag=false;
        int s=0;
        int e=19;
        int mid=(s+e)/2;
        while(s<=e)
        {
            if(arr[mid] == key)
            {
                index=mid;
                flag=true;
                break;

            }
           else  if(arr[mid] < key)
           s=mid+1;
           else if(arr[mid] > key)
           e=mid-1;

           mid=(s+e)/2;

        }
        if(flag)
        {
           System.out.println("Search element is present at index:"+index); 
        }
        else
        {
            System.out.println("The element which you want to search is not present in this array"); 
        }


    }
}
public class Classandobject8 {
    public static void main(String args[])
    {
        Searcharray obj=new Arr();
        int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the 20 array elements:");
        // for(int i=0;i<20;i++)
        // {
        //     arr[i]=sc.nextInt();
        // }
        System.out.println("Enter the element which you want to search:");
        int k=sc.nextInt();
        System.out.println("Enter the choice:\n"+"1.For linear search\n"+"2.For binary search");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:
            {
                obj.linsearch(arr,k);
                break;
            }
            case 2:
            {
                obj.sort(arr);
                obj.binsearch(arr,k);
            }

        }
    }
}
