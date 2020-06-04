import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      {
        a[i]=in.nextInt();
      }
      int value=in.nextInt();
      pairs(n,a,value);
    }
  public static void pairs(int n,int a[],int value)
  {
    int i,j,sum;
    for(i=0;i<n;i++)
    {
      for(j=i+1;j<n;j++)
      {
        sum=a[i]+a[j];
        if(sum==value)
        {
          System.out.println(a[i]+", "+a[j]);
        }
      }
    }
  }
}