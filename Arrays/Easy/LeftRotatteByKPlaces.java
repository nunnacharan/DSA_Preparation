package DSA_Preparation.Arrays.Easy;
import java.util.*;
public class LeftRotatteByKPlaces 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        leftRotateByK(arr,k);
        
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void leftRotateByK(int arr[],int k)
    {
        int n=arr.length;
        k=k%n;

        helper_function(arr,0,k-1);
        helper_function(arr,k,n-1);
        helper_function(arr,0,n-1);
        
    }

    public static void helper_function(int arr[],int start,int end )
    {
        while(start<=end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    

    
}
