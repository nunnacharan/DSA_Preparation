package DSA_Preparation.Arrays.Easy;
import java.util.*;
public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println(secondLargest(arr));
    }   
    public static int secondLargest(int arr[])
    {
        int n=arr.length;
        int largest=arr[0];
        int second=Integer.MIN_VALUE;

        for(int i=0;i<n;i++)
        {
            if(arr[i]>largest)
            {
                second=largest;
                largest=arr[i];
            }
            else if(arr[i]<largest && arr[i]>second)
            {
                second=arr[i];
            }
        }
        return second;
    }
}
