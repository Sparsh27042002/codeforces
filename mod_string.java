import java.util.*;
public class mod_string
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String str=s.substring(0,1).toUpperCase()+s.substring(1);
        System.out.println(str);
    }
}