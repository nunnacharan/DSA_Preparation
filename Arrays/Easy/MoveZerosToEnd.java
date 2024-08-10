package DSA_Preparation.Arrays.Easy;
import java.util.*;
public class MoveZerosToEnd 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];          
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        moveZeros(nums);
        for(int i=0;i<n;i++)
        {
            System.out.print(nums[i]+" ");
        }
        sc.close(); 
    }
    public static void moveZeros(int nums[])
    {
        
        int n=nums.length;
        int i=0;
        for(int j=1;j<n;j++)
        {
            if(nums[i]!=0)
            {
                i++;
            }
            if(nums[i]==0 && nums[j]!=0)
            {
                nums[i]=nums[j];
                nums[j]=0;
                i++;
            }
        }
       

    }
    
}
