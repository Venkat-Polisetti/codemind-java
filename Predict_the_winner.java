import java.util.*;
class predict
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ec=0,oc=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            ec+=a[i];
            else
            oc+=a[i];
        }
        if(ec>oc)
        {
            if((ec-oc)%4==0)
            System.out.print("X");
            else
            System.out.print("Y");
        }
        else
        {
             if((oc-ec)%4==0)
            System.out.print("X");
            else
            System.out.print("Y");
        }
    }
}