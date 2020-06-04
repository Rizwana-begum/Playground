import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner in=new Scanner(System.in);
    String s=in.nextLine();
    int n=s.length();
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n-(i+1);j++)
      {
        System.out.print(" ");
      }
      int n1=n/2;
      int temp=0;
      for(int k=0;k<=i;k++)
      {
        if(n1>=n)
        {
          System.out.print(s.charAt(temp));
          temp++;
        }
        else
        {
          System.out.print(s.charAt(n1));
          n1++;
        }
      }
        System.out.println();
      }
  }
}