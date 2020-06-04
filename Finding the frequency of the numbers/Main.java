import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      int k = sc.nextInt();
        int arr[] = new int[n];
        for(int idx = 0; idx <= n - 1; idx++){
            arr[idx] = sc.nextInt();
        }
      
     int stat[]=new int[k];
      for(int i=0;i<=k-1;i++)
      {
        stat[i]=0;
      }
      for(int i=0;i<=n-1;i++)
      {
        stat[arr[i]-1]++;
      }
      for(int i=0;i<=k-1;i++)
      {
        System.out.println((i+1)+" "+stat[i]);
      }
    }
}