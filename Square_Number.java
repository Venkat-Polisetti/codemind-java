import java.util.Scanner;
class sample
{
    public static boolean squarenum(int n)
    {
        int i,j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i*i+j*j==n)
                {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if(squarenum(n))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}