import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int d=0;
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                d+=1;
            }
        }
        if(d>0)
        {
           System.out.println("Contains "+d+" "+"digit"); 
        }
        else
        {
            System.out.println("Doesn't contain digit");
        }
    }
}