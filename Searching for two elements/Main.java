import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in=new Scanner(System.in);
      int arr_size=in.nextInt();
      int arr[]=new int[arr_size];
      for(int i=0;i<=arr_size-1;i++)
      {
        arr[i]=in.nextInt();
      }
      int k1=in.nextInt();
      int k2=in.nextInt();
      int k1_index=-1;
      int k2_index=-1;
      for(int i=0;i<=arr_size-1;i++)
      {
        if(k1==arr[i])
        {
          k1_index=i;
        }
        if(k2==arr[i])
        {
          k2_index=i;
        }
      }
      System.out.println(k1_index);
      System.out.println(k2_index);
    }
}