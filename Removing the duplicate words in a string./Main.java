import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner in=new Scanner(System.in);
    String str=in.nextLine();
    String s[]=str.split(" ");
    for(int i=0;i<s.length;i++)
    {
      if(s[i]!=null)
      {
        for(int j=i+1;j<s.length;j++)
        {
          if(s[i].equals(s[j]))
          {
            s[j]=null;
          }
        }
      }
    }
    for(int k=0;k<s.length;k++)
    {
      if(s[k]!=null)
      {
        System.out.print(s[k]+" ");
      }
  }
}
}