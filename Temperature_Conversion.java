import java.util.Scanner;
class teddy
{
    public static void main(String args[])
    {
        int c;
        double f;
        Scanner sc=new Scanner(System.in);
        c=sc.nextInt();
        f=32+(c*9.0/5);
        System.out.format("%.2f",f);
        
    }
}