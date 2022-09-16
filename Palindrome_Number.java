import java.util.Scanner;
class pal
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,n;
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
        a=sc.nextInt();
        int temp=0,rev=0;
        temp=a;
        while(a!=0)
        {
            int d=a%10;
            rev=rev*10+d;
            a/=10;
        }
        if(rev==temp)
        System.out.println("True");
        else
        System.out.println("False");
        }
    }
}