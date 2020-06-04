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
      subsets(n,a);
    }
  public static void subsets(int n,int a[])
  {
    int i,j,k;
    for(i=0;i<n-1;i++)
    {
      for(k=i+1;k<n;k++)
      {
      for(j=k+1;j<n;j++)
      {
        System.out.print("("+a[i]+", "+a[k]+", "+a[j]+")"+" ");
      }
      }
      System.out.println();
    }
  }     
}
