import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int v=0,c=0,d=0,ws=0;
        String s=sc.nextLine();
        String vowels="AEIOUaeiou";
        String consonants="bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(vowels.contains(ch+""))
            {
                v=v+1;
            }
            else if(consonants.contains(ch+""))
            {
                c=c+1;
            }
            else if((int)ch>=48 && (int)ch<=57)
            {
                d=d+1;
            }
            else
            {
                ws=ws+1;
            }
        }
        System.out.println("Vowels: "+v);
        System.out.println("Consonants: "+c);
        System.out.println("Digits: "+d);
        System.out.println("White spaces: "+ws);
    }
}