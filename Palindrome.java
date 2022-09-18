import java.util.Scanner;
class sample
{
    public static boolean pali(int n)
    {
        int rev=0,d,temp;
        temp=n;
        while(n!=0)
        {
            d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        if(temp==rev)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if(pali(n))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}