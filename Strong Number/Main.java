import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int num=n,fact,i,remainder,sum=0;
      while(num>0)
      {
        fact=1;
        i=1;
        remainder=num%10;
        while(i<=remainder)
        {
          fact=fact*i;
          i++;
        }
        sum=sum+fact;
        num=num/10;
      }
      if(n==sum)
        System.out.println("Yes");
      else
        System.out.println("No");
	}
}