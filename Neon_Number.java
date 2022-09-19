import java.util.Scanner;
class sumsub
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,pd=1,sum=0,sq=0;
        n=sc.nextInt();
        sq=n*n;
        while(sq!=0)
        {
            int d=sq%10;
            sum+=d;
            sq/=10;
        }
        if(sum==n)
        System.out.print("Neon Number");
        else
        System.out.print("Not Neon Number");
    }
}