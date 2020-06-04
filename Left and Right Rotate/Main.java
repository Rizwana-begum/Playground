import java.util.Scanner;
class Main 
{
  public static void main(String args[])
    {
    	//Try your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=in.nextInt();
    }
    int r=in.nextInt();
    left_rotate(n,a,r);
    right_rotate(n,a,r);
    for(int index=0;index<n;index++)
    {
      System.out.print(a[index]+" ");
    }
  	}
  public static void left_rotate(int n,int a[],int r)
  {
    int f_even=1;
    int l_even;
    if(n%2==0)
    {
      l_even=n-1;
    }
    else
    {
      l_even=n-2;
    }
    for(int i=1;i<=r;i++)
    {
      int temp=a[f_even];
      for(int j=3;j<n;j=j+2)
      {
        a[j-2]=a[j];
      }
      a[l_even]=temp;
    }
  }
  public static void right_rotate(int n,int a[],int r)
  {
    int f_odd=0;
    int l_odd;
    if(n%2==1)
      l_odd=n-1;
    else
      l_odd=n-2;
    for(int i=1;i<=r;i++)
    {
      int temp=a[l_odd];
      for(int j=(l_odd-2);j>=0;j=j-2)
      {
        a[j+2]=a[j];
      }
      a[f_odd]=temp;
    }
  }
}