import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=in.nextInt();
    }
    perfect_batch(arr,n);
  }
  public static void perfect_batch(int a[],int n)
  {
    boolean batch=true;
    int sum=a[0]+a[1]+a[2];
    for(int j=3;j<=n-1;j=j+3)
    {
      int batch_sum=a[j]+a[j+1]+a[j+2];
    if(sum!=batch_sum)
    {
      batch=false;
    }
    }
    if(batch==true)
    {
      System.out.println("Perfect Batch");
    }
    else
    {
      System.out.println("Not a Perfect Batch");
    }
}
}