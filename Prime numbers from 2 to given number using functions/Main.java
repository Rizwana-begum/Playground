import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      prime(n);
	}
  public static void prime(int a)
  {
    int i=2,j,count=0;
    for(i=1;i<=a;i++)
    {
      count=0;
      for(j=1;j<=a;j++)
      {
        if(i%j==0)
          count++;
      }
      if(count==2)
        System.out.println(i);
    }
  }
}