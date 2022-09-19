import java.util.Scanner;
class valid
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int a,c=0;
            a=sc.nextInt();
            for(int j=1;j<=a;j++)
            {
            if((j*j)==a)
            {
                c=1;
                break;
            }
            }
            if(c==0)
            System.out.println("False");
            else
            System.out.println("True");
        }
    }
}