import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code 
      Scanner in=new Scanner(System.in);
      int b=in.nextInt();
      int e=in.nextInt();
      power(b,e);
	}
  public static void power(int a,int b)
  {
    int n=a,count=1;
    while(count<b)
    {
      a=a*n;
     ++count;
    }
    System.out.println(a);
  }
}