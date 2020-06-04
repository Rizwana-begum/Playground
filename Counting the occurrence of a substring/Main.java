import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner in=new Scanner(System.in);
    String s=in.nextLine();
    String s1=in.nextLine();
    int count=0,i=0;
    while((i=s.indexOf(s1,i))!=-1)
    {
      count++;
      i++;
    }
    System.out.println(count);
  } 
}