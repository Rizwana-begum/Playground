import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here0
      Scanner in=new Scanner(System.in);
      int base=in.nextInt();
      int exponent=in.nextInt();
      int i=0,sum=1;
      while(i<exponent)
      {
        sum=sum*base;
        i++;
      }
      System.out.println(sum);
    }
}