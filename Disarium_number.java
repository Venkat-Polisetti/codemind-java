import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,c=0,temp,d,res=0;
        n=sc.nextInt();
        temp=n;
        while(n!=0)
        {
            d=n%10;
            c+=1;
            n=n/10;
        }
        n=temp;
        while(n!=0)
        {
            d=n%10;
            res+=Math.pow(d,c);
            n=n/10;
            c-=1;
        }
        if(temp==res)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}