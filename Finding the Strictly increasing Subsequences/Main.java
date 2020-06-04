import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=in.nextInt();
    }
    for(int i=0;i<n;i++)
    {
      int sum=0;
      for(int j=i+1;j<n;j++)
      {
        int temp=sum;
        if(a[i]<a[j])
        {
          sum=a[i]+a[j];
          if(sum>temp)
          {
          System.out.println(a[i]+","+a[j]);
          }
        }
      }
    }
  }
}