import java.util.*;
class smaple
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int max=97;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(max<(int)ch)
            {
                max=(int)ch;
                
            }
        }
        System.out.println((char)max);
        
    }
}