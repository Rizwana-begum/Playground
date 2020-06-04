import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        // Type your code here
        Scanner in=new Scanner(System.in);
      char ch=in.next().charAt(0);
      int key=in.nextInt();
      int offset=0,i;
      if(ch>='a' && ch<='z')
      {
        for(i=1;i<=key;i++)
        {
        offset=ch-i;
        }
        offset=offset+26;
      }
      if(ch>='A' && ch<='Z')
      {
        for(i=1;i<=key;i++)
        {
          offset=ch-i;
        }
      }
      System.out.println((char)(offset));
   
    }
}