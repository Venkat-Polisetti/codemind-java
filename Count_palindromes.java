import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        int n,x[],c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            int d,r=0,temp;
            temp=x[i];
            while(x[i]!=0)
            {
                d=x[i]%10;
                r=r*10+d;
                x[i]=x[i]/10;
            }
            if(r==temp)
            {
                c+=1;
            }
        }
        System.out.println(c);
        sc.close();
    }
}