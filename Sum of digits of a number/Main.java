import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int temp,sum=0;
      while(n!=0)
      {
        temp=n;
        temp=temp%10;
        sum=sum+temp;
        n=n/10;
      }
      System.out.println(sum);
	}
}