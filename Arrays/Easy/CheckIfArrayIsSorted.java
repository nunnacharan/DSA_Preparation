package DSA_Preparation.Arrays.Easy;
import java.util.*;
public class CheckIfArrayIsSorted 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(sortedArray(arr));
    }
    public static boolean sortedArray(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>arr[i-1])
            {
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
    
}
