import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int divisor=gcd_of_2numbers(n1,n2);
      System.out.println(gcd_of_2numbers(n1,n2));
	}
  public static int gcd_of_2numbers(int a,int b)
  {
    int i;
    if(a<b)
      i=a;
    else
      i=b;
    while(i>=1)
    {
      if((a%i==0)&&(b%i==0))
        return i;
    --i;
    }
  return 0;
}
}