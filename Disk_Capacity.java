import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        int t,s,b,x;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        s=sc.nextInt();
        b=sc.nextInt();
        x=2*512*t*s*b;
        System.out.println(x);
        
    }
}