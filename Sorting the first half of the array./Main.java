import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code;
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=in.nextInt();
    }
    for(int j=0;j<n/2;j++)
    {
    for(int i=1;i<n/2;i++)
    {
      if(a[i-1]>a[i])
      {
        int temp=a[i-1];
        a[i-1]=a[i];
        a[i]=temp;
      }
    }
    }
    for(int i=0;i<n;i++)
    {
      System.out.print(a[i]+" ");
    }
  }
}