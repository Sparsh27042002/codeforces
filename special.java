import java.util.*;
public class special
{
    public static void main(String args[])
    {
        
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            
            while(n!=0)
            {
                int len=sc.nextInt();
                if(len%2==0)
                {
                    System.out.println("YES");
                    for(int i=0;i<len/2;i++)
                    {
                        if(i%2==0)
                        {
                            System.out.print("AA");
                        }
                        else
                        {
                            System.out.print("BB");
                        }
                    }
                    System.out.println();
                }
                else
                {
                    System.out.println("NO");
                }
                n--;
            }
    }
}