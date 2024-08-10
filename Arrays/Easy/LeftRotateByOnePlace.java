package DSA_Preparation.Arrays.Easy;
import java.util.*;

public class LeftRotateByOnePlace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        leftrotate(arr);
        for(int i=0;i<n;i++)
        {
           System.out.print(arr[i]+" ");
        }
    }

    public static int[] leftrotate(int arr[])
    {
        int n=arr.length;
        int temp=arr[0];
        for(int i=1;i<n;i++)
        {
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;

        return arr;
    }

}
