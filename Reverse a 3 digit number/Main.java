import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int reverse=0;
    while(n!=0)
    {
      int digit=n%10;
      reverse=reverse*10+digit;
      n/=10;
  }
    System.out.println(reverse);
}
}