import java.util.Scanner;
class reverse
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,rev=0;
        a=sc.nextInt();
        while(a!=0)
        {
            int d=a%10;
            rev=rev*10+d;
            a/=10;
        }
        System.out.print(rev);
    }
}
