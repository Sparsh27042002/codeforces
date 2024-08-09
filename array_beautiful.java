import java.util.*;
public class array_beautiful
{
    public void calculate()
    {
        Scanner sc=new Scanner(System.in);
        int ar[][]=new int[5][5];
        int temp1=0;int temp2=0;
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                ar[i][j]=sc.nextInt();
                if(ar[i][j]==1)
                {
                    temp1=i;
                    temp2=j;
                }
            }
        }
        int result=Math.abs(temp1-2)+Math.abs(temp2-2);
        System.out.println(result);
    }
    public static void main(String arsg[])
    {
        array_beautiful ob=new array_beautiful();
        ob.calculate();
    }
}