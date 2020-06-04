import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int num=n,result=0,remainder;
      while(n!=0)
      {
        //num=n;
        remainder=n%10;
        result+=remainder*remainder*remainder;
        n=n/10;
	}
      if(num==result)
      System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
}
}