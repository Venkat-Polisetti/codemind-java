import java.util.*;
class smaple
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        String s3=s1+s2;
        char charray[]=s3.toCharArray();
        Arrays.sort(charray);
        System.out.println(new String(charray));
        
        
    }
}