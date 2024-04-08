import java.util.Scanner;
class search{
    int a[]=new int[50];
    void assign(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            a[i]=arr[i];
        }
    }
    boolean find(int target)
    {
        
        for(int i=0;i<a.length;i++)
        {
            if(target == a[i])
            return true;
        }
        return false;
    }


}
public class Arraysearch {
    public static void main(String args[])
    {
        int n,target;
        search obj=new search();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        obj.assign(arr);
        System.out.println("Enter the search element:");
        target=sc.nextInt();
        boolean ans=obj.find(target);
        if(ans)
        System.out.println("Element present");
        else
        System.out.println("Element absent");



    }
}
