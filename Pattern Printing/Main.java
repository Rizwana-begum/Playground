import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       //Try your code here
      Scanner in=new Scanner(System.in);
      int row=in.nextInt();
      int col=in.nextInt();
      for(int i=1;i<=row;i++)
      {
        for(int j=col;j>col-i;j--)
        {
          System.out.print(j);
        }
        for(int j=1;j<=col-i;j++)
        {
          System.out.print(row-i+1);
        }
        System.out.println();
      }
    }
}