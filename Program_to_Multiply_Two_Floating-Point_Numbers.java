import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float a,b;
        float c;
        a=sc.nextFloat();
        b=sc.nextFloat();
        c=a*b;
        System.out.printf("%.2f",c);
    }
}