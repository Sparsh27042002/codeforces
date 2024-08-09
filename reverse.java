import java.util.*;
public class reverse
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        String str="";
        for(int i=a.length()-1;i>=0;i--)
        {
            str=str+a.charAt(i);
        }
        if(str.equals(b))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}