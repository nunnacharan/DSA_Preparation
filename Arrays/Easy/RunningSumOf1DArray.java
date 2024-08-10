package DSA_Preparation.Arrays.Easy;
import java.util.*;
public class RunningSumOf1DArray
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        runningSum(nums);
        for(int i=0;i<n;i++)
        {
            System.out.print(nums[i]+" ");
        }
        sc.close();
    }
    public static int[] runningSum(int nums[])
    {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            nums[i]=sum;
        }
        return nums;
    }
    
}
