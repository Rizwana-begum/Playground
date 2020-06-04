import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in=new Scanner(System.in);
      String s=in.nextLine();
      int n=s.length();
      String temp="";
      for(int i=n-1;i>=0;i--)
      {
        temp=temp+s.charAt(i);
      }
      if(s.equals(temp))
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
          
    } 
}