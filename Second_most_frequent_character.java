import java.util.*;
class sample
{
 static final int totalchar = 256;
 static char get2ndMostFreq(String str)
 {
  int ctr[] = new int[totalchar];
  int i;
  for (i = 0; i < str.length(); i++)
   (ctr[str.charAt(i)])++;
  int ctr_1 = 0, ctr_2 = 0;
  for (i = 0; i < totalchar; i++)
  {
   if (ctr[i] > ctr[ctr_1])
   {
    ctr_2 = ctr_1;
    ctr_1 = i;
   }
   else if (ctr[i] > ctr[ctr_2] && ctr[i] != ctr[ctr_1])
   {
        ctr_2 = i;
   }
   }
  return (char) ctr_2;
 }
 public static void main(String args[])
 {
     Scanner sc=new Scanner(System.in);
  String s=sc.nextLine();
  char ch = get2ndMostFreq(s);
  if (ch != NULL)
   System.out.println(ch);
  else
   System.out.println("-1");
 }
}
