import java.util.Scanner;
class sumsub
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,pd=1,sum=0;
        n=sc.nextInt();
        while(n!=0)
        {
            int d=n%10;
            sum+=d;
            pd*=d;
            n/=10;
        }
        System.out.print(Math.abs(sum-pd));
    }
}