import java.util.Scanner;
class smaple
{
    public static void main(String args[])
    {
        Scanner t=new Scanner(System.in);
        String s=t.nextLine();
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch>=48 && ch<=57)
            {
                sum=sum+(ch-48);
            }
        }
        System.out.println(sum);
    }
}