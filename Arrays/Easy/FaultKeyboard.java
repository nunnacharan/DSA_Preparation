package DSA_Preparation.Arrays.Easy;
import java.util.*;
public class FaultKeyboard
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
       String ans= finalString(s);
       System.out.println(ans);
    }
    public static String finalString(String s)
    {
        String ans="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='i')
            {
                ans=reverse(ans);
            }
            else
            {
                ans=ans+s.charAt(i);
            }
        }
        return ans;
    }
    public static String reverse(String ans)
    {
        char ch[]=ans.toCharArray();
        int i=0;
        int j=ch.length-1;
        while(i<j)
        {
            char temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;
            j--;
        }
        String res=new String(ch);
        return res;
    }

    
}
