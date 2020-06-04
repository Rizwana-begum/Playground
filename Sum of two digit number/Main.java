import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int temp=n;
      n=n/10;
      temp=temp%10;
      int sum=n+temp;
      System.out.println(sum);
	}
}