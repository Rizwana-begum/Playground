import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int arr[]=new int[n];
    int large;
    for(int i=0;i<n;i++)
    {
      arr[i]=in.nextInt();
    }
    if(arr[0]>arr[1])
    {
      large=0;
    }
    else
    {
      large=1;
    }
    for(int j=2;j<=n-1;j++)
    {
      if(arr[large]<arr[j])
      {
        large=j;
      }
    }
    System.out.println(large);
  }
}
