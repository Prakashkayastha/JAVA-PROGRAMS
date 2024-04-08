import java.util.Scanner;
class sum{
    int size;
    int a[] = new int[50];
   
    Scanner sc=new Scanner(System.in);
     void assign(int[] arr)
    {
       for(int i=0;i<arr.length;i++)
       {
        a[i]=arr[i];
       }
    }
     int addition()
    {
        int ans=0;
        for(int i=0;i<a.length;i++)
        {
            ans += a[i];
        }
        return ans;
    }

    

}
public class Arraysum {
    

    public static void main(String args[])
    {
        sum obj=new sum();
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        obj.assign(arr);
        int ans=obj.addition();
        System.out.println("Answer="+ans);
        
        

        



    }
    
}
