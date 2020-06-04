import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in=new Scanner(System.in);
      String s=in.nextLine();
      StringBuilder str=new StringBuilder(s);
      int front=0;
      int end=s.length()-1;
      reverse_string(str,front,end);
    }
    // Function to reverse a string
    public static void reverse_string(StringBuilder sb, int start_idx, int end_idx)
    {
        // Type your code here
      int count=0;
      for(int j=end_idx;j>=start_idx;j--)
      {
        if(sb.charAt(j)==' ')
        {
          int temp=count+j;
          count=0;
          for(int i=j+1;i<=temp;i++)
          {
            System.out.print(sb.charAt(i));
          }
          System.out.print(" ");
        }
        else
        {
          count++;
        }
      }
      System.out.print("I");
    }
}