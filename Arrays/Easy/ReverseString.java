package DSA_Preparation.Arrays.Easy;
import java.util.*;
public class ReverseString 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char[] s=new char[n];
        for(int i=0;i<n;i++)
        {
            s[i]=sc.next().charAt(0);
        }
        reverse(s);
        for(int i=0;i<n;i++)
        {
            System.out.print(s[i]+" ");
        }

    }
    public static void reverse(char[] s)
    {
        int n=s.length;
        int i=0,j=n-1;
        while(i<=j)
        {
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;

            i++;
            j--;
        }
    }
    
}
