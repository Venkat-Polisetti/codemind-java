import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double a,c;
        a=sc.nextDouble();
        c=3.14*a*a;
        System.out.printf("%.2f",c);
    }
}