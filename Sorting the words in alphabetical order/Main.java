import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner in= new Scanner(System.in);
        int n = in.nextInt();
        String[] s = new String[n];
        for(int i = 0; i < n; i++)
        {
            s[i] = in.next();
        }
        int k = 0;
        for(int i = 0; i < n; i++)  
        {
            int ch=s[i].charAt(0);
            if(ch > 64 && ch < 91)
            {
                String str = s[i];
                char[] chr  = str.toCharArray();
                ch = ch + 32;
                chr[0] = (char)ch;
                s[i] = new String(chr);
            }
        }
        for(int i = 0; i < n - 1; ++i) 
        {
            for (int j = i + 1; j < n; ++j) 
            {
                if (s[i].charAt(k) > s[j].charAt(k)) 
                {
                    String temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                    k = 0;
                }
            }
        }
        for(int i = 0; i < n; i++) 
        {
            System.out.println(s[i]);
        }
  }
}