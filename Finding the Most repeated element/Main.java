import java.util.Scanner;
public class Main
{
    static int repeated(int arr[],int n,int freq[])
                       {
                         int max=0;
                         int count=1;
                         for(int i=0;i<n;i++)
                         {
                           for(int j=i+1;j<n;j++)
                           {
                             if(arr[i]==arr[j])
                               count++;
                           }
                           freq[i]=count;
                           count=1;
                         }
                         for(int i=0;i<n;i++)
                         {
                           if(freq[i]>freq[max])
                             max=i;
                         }
                         return arr[max];
                       }
  public static void main(String args[])
  {
    // your code here
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int freq[] = new int[n];
    System.out.print(repeated(arr,n,freq));
  }
}
                       