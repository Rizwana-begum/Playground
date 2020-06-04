import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int idx = 0; idx <= n - 1; idx++){
            arr[idx] = sc.nextInt();
        }
      boolean match=true;
      for(int i=0;i<n;i++)
      {
        int j=n-i-1;
        if(i==j)
          break;
        if(arr[i]!=arr[j])
          match=false;
      }
      if(match==true)
        System.out.println("Yes");
      else
        System.out.println("No");
    }
}