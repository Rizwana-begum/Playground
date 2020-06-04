import java.util.Scanner;
class Main {
    public static void main(String[] args) 
    {
		// Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      System.out.println(add(n));
    }
  public static int add(int n)
  {
    if(n>0)
      return n+add(n-1);
    else
      return 0;
    }
}