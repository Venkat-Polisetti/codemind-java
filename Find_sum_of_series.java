import java.util.Scanner;
class smaple
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        double i,s=0.0;
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            s = s + 1/i;
        }
        System.out.format("%.2f",s);
    }
}