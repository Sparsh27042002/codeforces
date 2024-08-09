import java.util.*;
public class bit
{
    public void cal()
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        int x=0;
        while(n!=0)
        {
            String s=sc.nextLine();
            if (s.contains("--")) 
            {
                x--;
            } 
            else if (s.contains("++")) 
            {
                x++;
            }
            n--;
        }
        System.out.println(x);
    }
    public static void main(String args[])
    {
        bit ob=new bit();
        ob.cal();
    }
}