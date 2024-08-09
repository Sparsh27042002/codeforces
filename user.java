import java.util.*;
public class user
{
    public void code()
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int len=s.length();
        int c=0;
        char ch[]=s.toCharArray();
        Arrays.sort(ch);
        c++;
        for(int x=1;x<len;x++)
        {
            if(ch[x]!=ch[x-1])   
            {
                c++;
            }
        }
        System.out.println(c%2==0?"CHAT WITH HER!":"IGNORE HIM");
    }
    public static void main(String args[])
    {
        user ob=new user();
        ob.code();
    }
}