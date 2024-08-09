class watermelon
{
    String ans="No";
    public String even(int n)
    {
        if(n%2==0)
        {
            ans="Yes";
        }
        return ans;
    }
    public static void main(String args[])
    {
        watermelon ob=new watermelon();
        System.out.println(ob.even(5));
    }
}