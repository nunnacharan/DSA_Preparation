package DSA_Preparation.Arrays.Easy;
import java.util.*;

public class ReverseVowelsInAString 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
       
        String s=sc.nextLine();
        String ans=reverseVowels(s);
        System.out.println(ans);
    }    
    public static String reverseVowels(String s)
    {
        int n=s.length();
        char c[] = s.toCharArray();
        Set<Character>st=new HashSet<>();
        st.add('a');
        st.add('e');
        st.add('i');
        st.add('o');
        st.add('u');
        st.add('A');
        st.add('E');
        st.add('I');
        st.add('O');
        st.add('U');
        int i=0,j=n-1;
        while(i<j)
        {
            if(!st.contains(c[i])) i++;
            if(!st.contains(c[j])) j--;
            if(st.contains(c[i]) && st.contains(c[j])){
                char temp=c[i];
                c[i]=c[j];
                c[j]=temp;
                i++;
                j--;
            }
        }
        String ans = new String(c);
        return ans;
    }
}
