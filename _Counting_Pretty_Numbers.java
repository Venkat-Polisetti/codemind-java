import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t!=0)
        {
            int l,r,c=0,d=0;
            l=sc.nextInt();
            r=sc.nextInt();
            for(int i=l;i<=r;i++)
            {
                d=i%10;
                if(d==2 || d==3 || d==9)
                {
                    c+=1;
                }
            }
            System.out.println(c);
            t-=1;
        }
    }
}