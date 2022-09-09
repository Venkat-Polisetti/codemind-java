import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        int i,n,k,c=0;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        k=sc.nextInt();
        int x[]=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(x[i]%k==0)
            {
                c+=1;
            }
        }
        System.out.println(c);
        sc.close();
    }
}