import java.util.Scanner;
class index
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int on=0;
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==1)
            {
                on=a[i];
            }
        }
        System.out.print(on);
    }
}