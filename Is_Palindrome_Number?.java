import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        int n,d,x=0,temp;
        
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        temp=n;
        while(n!=0)
        {
            d=n%10;
            x=x*10+d;
            n=n/10;
        }
        if(x==temp)
        {
            System.out.println("2");
        }
        else
        {
            System.out.println("1");
        }
        sc.close();
    }
}