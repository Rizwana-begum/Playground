import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a[]=new int[n];
      int i;
      for(i=0;i<n;i++)
      {
        a[i]=in.nextInt();
      }
      zero(a,n);
    }
  public static void zero(int a[],int n)
  {
    int j,count=0;
    for(j=0;j<n;j++)
    {
      if(a[j]==0)
      {
        count++;
      }
      else
      {
        System.out.print(a[j]+" ");
      }
    }
    for(j=1;j<=count;j++)
    {
      System.out.print("0 ");
    }
  }
}