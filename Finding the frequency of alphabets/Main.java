import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in=new Scanner(System.in);
      String str=in.nextLine();
      StringBuilder s=new StringBuilder(str);
      int n=s.length();
      int stat[]=new int[26];
      for(int i=0;i<26;i++)
      {
        stat[i]=0;
      }
      for(int i=0;i<n;i++)
      {
        if(s.charAt(i)>='A' && s.charAt(i)<='Z')
        {
          int offset=s.charAt(i)-'A';
          char ch=(char)(offset+'a');
          s.setCharAt(i,ch);
        }
        if(s.charAt(i)>='a' && s.charAt(i)<='z')
        {
          stat[s.charAt(i)-'a']++;
        }
      }
      for(int i=0;i<n;i++)
      {
        if(stat[s.charAt(i)-'a']!=0)
        {
          System.out.print(s.charAt(i)+""+stat[s.charAt(i)-'a']+" ");
          stat[s.charAt(i)-'a']=0;
        }
      }
    }
}