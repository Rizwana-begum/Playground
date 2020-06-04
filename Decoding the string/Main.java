import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
     Scanner in = new Scanner(System.in);
    String str= in.nextLine();
    int key = in.nextInt();
    StringBuilder s = new StringBuilder(str); 
    int n=s.length();
    for(int i=0;i<n;i++)
    {
      char ch=(char)(s.charAt(i));
      if(ch>='A'&&ch<='Z')
      {
        ch=(char)(ch-key);
        if(ch<'A')
        {
          ch=(char)(ch+26);
        }
      }
      else if(ch>='a'&&ch<='z')
      {
        ch=(char)(ch-key);
        if(ch<'a')
        {
          ch=(char)(ch+26);
        }
      }
      s.setCharAt(i,ch);
    }
    System.out.println(s);
  }
}