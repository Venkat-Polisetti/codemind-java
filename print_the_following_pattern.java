import java.util.Scanner;
class pattern
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=(64+n);i>64;i--)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print((char)i+" ");
            }
            System.out.println();
            n-=1;
        }
    }
}