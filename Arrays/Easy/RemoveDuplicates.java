package DSA_Preparation.Arrays.Easy;
import java.util.*;
public class RemoveDuplicates 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(remove(arr));
        sc.close();
    }
    public static int remove(int arr[])
    {
        // We need to solve this question in optimal approach we need to follow 2 pointers...

        int i=0;
        for(int j=1;j<arr.length;j++)
        {
            if(arr[j]!=arr[i])
            {
                arr[i+1]=arr[j];
                i++;
            }
        }
        return (i+1);
    }
}
