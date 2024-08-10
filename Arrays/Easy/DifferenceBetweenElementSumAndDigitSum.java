package DSA_Preparation.Arrays.Easy;
import java.util.*;
public class DifferenceBetweenElementSumAndDigitSum
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        System.out.println( differenceOfSum(nums));
        
    }

    public static int differenceOfSum(int nums[])
    {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
        }
        //System.out.println(sum);
        int ans=helper(nums);
       // System.out.println(ans);
        int res=Math.abs(sum-ans);
        return res;

    }
    public static int helper(int nums[])
    {
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            int n=nums[i];
            while(n>0)
            {
                int temp=n;
                n=temp%10;
              // System.out.println(n);
                ans=ans+n;
                //System.out.println(ans);
                n=temp/10;
            }
        }
        return ans;
    }
    
}
