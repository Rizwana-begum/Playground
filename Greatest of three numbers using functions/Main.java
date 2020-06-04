import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      large(n1,n2,n3);
	}
  public static void large(int a,int b,int c)
  {
    if(a>b)
      a=a;
    else
      a=b;
    if(a>c)
      a=a;
    else
      a=c;
    System.out.println(a);
  }
  
}