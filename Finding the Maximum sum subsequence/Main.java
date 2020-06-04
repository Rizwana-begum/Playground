import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
    int i=0,j=0;
        for( i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(sequence(arr,n));
  }
    public static int sequence(int arr[],int n)
    {
      int r_max,m_max,i;
      r_max=arr[0];
      m_max=arr[0];
      for( i=1;i<n;i++)
      {
        if(arr[i]>arr[i-1])
        {
           r_max+=arr[i];
        }
        else
          
        {
          r_max=arr[i];
        }
        if(r_max>m_max)
        {
          m_max=r_max;
        }
      }
      return m_max;
     
  }
}