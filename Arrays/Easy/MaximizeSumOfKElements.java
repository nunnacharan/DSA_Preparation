package DSA_Preparation.Arrays.Easy;
import java.util.*;
public class MaximizeSumOfKElements 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println(maximizeSum(nums,k));
    }
    public static int maximizeSum(int nums[],int k)
    {
        int sum=0;
        while(k-- >0)
        {
            
            sum=sum+helper(nums);
        }
        return sum;
    }
    public static int helper(int nums[])
    {
        int max=nums[0];
        int index=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>max)
            {
                max=nums[i];
                index=i;
            }
        }
        nums[index]=nums[index]+1;
        return max;
    }
    
}
