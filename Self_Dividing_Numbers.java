import java.util.Scanner;
class perfect
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        for(int i=a;i<=b;i++)
        {
            int c=0;
            int sum=0;
            int temp=i;
            while(temp>0)
           {
            int d=temp%10;
            c++;
            if(d==0)
            break;
            else if(i%d==0)
            sum++;
            temp/=10;
           }
        if(c==sum)
        {
        System.out.print(i+" ");
        }
    }
}
}