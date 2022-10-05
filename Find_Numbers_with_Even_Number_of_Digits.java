import java.util.Scanner;
class clothing 
{
    public static boolean evendig(int n)
    {
        int c=0;
        while(n!=0)
        {
            int d=n%10;
            c++;
            n/=10;
        }
        if(c%2==0)
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
        int n=sc.nextInt();
        int a[]=new int[n];
        int c=0;
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        {
           if(evendig(a[i]))
           {
               c++;
           }
        }
        System.out.print(c);
    }
}