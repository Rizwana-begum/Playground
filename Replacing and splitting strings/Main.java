import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      //Try your code hereScanner 
      Scanner in=new Scanner(System.in);
      String s1=in.nextLine();
      String s2=in.nextLine();
      int n=in.nextInt();
      String s3=s1.replace(s1,s2);
      String flag[]=s3.split(" ",n);
      for(String r: flag)
        System.out.println(r);
    }
}