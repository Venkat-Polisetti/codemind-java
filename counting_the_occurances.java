import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char t=sc.next().charAt(0);
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            {
                if(ch==t)
                {
                    c++;
                }
            }
        }
        if(c>0)
        {
            System.out.println(c);
        }
        else
        {
            System.out.println("-1");
        }
        
    }
}