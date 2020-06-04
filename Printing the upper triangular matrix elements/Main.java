import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner in=new Scanner(System.in);
    int r=in.nextInt();
    int c=in.nextInt();
    int i,j;
    int[][] m=new int[r][c];
    for(i=0;i<r;i++)
    {
      for(j=0;j<c;j++)
      {
        m[i][j]=in.nextInt();
      }
    }
    matrix(r,c,m);
  }
  public static void matrix(int r,int c,int[][] m)
  {
    int i,j,k;
    for(k=0;k<c;k++)
    {
      for(i=0,j=k;j<c;i++,j++)
      {
        System.out.print(m[i][j]+" ");
      }
    }
  }
}