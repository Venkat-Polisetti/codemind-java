import java.util.Scanner;
class adam
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
    int n,x,d=0,y=0,z,a=0;
    n=sc.nextInt();
    x=n*n;
    while(n!=0)
    {
        d=n%10;
        y=y*10+d;
        n=n/10;
    }
    z=y*y;
    while(z!=0)
    {
        d=z%10;
        a=a*10+d;
        z=z/10;
    }
    if(a==x)
    {
        System.out.print("True");
    }
    else
    {
        System.out.print("False");
    }
    }
}