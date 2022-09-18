import java.util.Scanner;
class disarium
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,ld=0;
        n=sc.nextInt();
        while(n!=0)
        {
            int d=n%10;
            if(d>ld)
            ld=d;
            n/=10;
        }
        System.out.print(ld);
    }
}
