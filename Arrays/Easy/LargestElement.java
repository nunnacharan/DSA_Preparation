package DSA_Preparation.Arrays.Easy;
import java.util.*;

public class LargestElement
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(largestElement(arr));
    }
    
    public static int largestElement(int arr[])
    {
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
    
            }
        }
        return max;
    }
}
    
