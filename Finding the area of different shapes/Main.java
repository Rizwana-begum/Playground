import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //Try your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      switch(n)
      {
        case 1:
          int s=in.nextInt();
          int area1=s*s;
          System.out.println(area1);
          break;
        case 2:
          int l=in.nextInt();
          int b=in.nextInt();
          int area2=l*b;
          System.out.println(area2);
          break;
        case 3:
          int base=in.nextInt();
          int h=in.nextInt();
          int area3=(base*h)/2;
          System.out.println(area3);
          break;
        case 4:
          int r=in.nextInt();
          double area4=3.14*r*r;
          System.out.println(area4);
          break;
        default:
          System.out.println("not found");
      }
                             
    }
}