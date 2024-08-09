import java.util.*;
public class sticks
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c;
        while(n!=0)
        {
            HashMap<Integer,Integer> map=new HashMap<>();
            int stick=sc.nextInt();
            int ar[]=new int[stick];
            c=0;
            for(int i=0;i<stick;i++)
            {
                ar[i]=sc.nextInt();
            }
            for(int i=0;i<stick;i++)
            {
                map.put(ar[i],map.getOrDefault(ar[i],0)+1);
            }
            for(int i=0;i<stick;i++)
            {
                if(map.containsKey(ar[i]) && map.get(ar[i])>=3)
                {
                    c++;
                    map.put(ar[i],map.get(ar[i])-3);
                }
            }
            map.clear();
            n--;
            System.out.println(c);
        }
    }
}