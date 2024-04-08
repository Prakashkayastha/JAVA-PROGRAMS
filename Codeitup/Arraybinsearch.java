import java.util.Scanner;
class binsearch{
    int a[]=new int[50];
    void assign(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            a[i]=arr[i];
        }
    }
    int check(int key)
    {
        int s=0;
        int e=a.length;
        int mid=(s+e)/2;
        while(s<=e)
        {
            if(a[mid] == key)
            return mid;

            if(key > a[mid])
            s=mid+1;
            else
            e=mid-1;

            mid=(s+e)/2;

        }
        return -1;

    }
}
public class Arraybinsearch {
    public static void main(String args[])
    {
        int n,target;
        binsearch obj=new binsearch();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        obj.assign(arr);
        System.out.println("Enter the element which you want to search:");
        target=sc.nextInt();
        int index=obj.check(target);
        System.out.println("The element is present at index:"+index);

    }
}
