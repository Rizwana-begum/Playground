import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      // Type your code here  
      Scanner in=new Scanner(System.in);
      String str1=in.nextLine();
      String str2=in.nextLine();
      String str3=in.nextLine();
      StringBuilder sb1=new StringBuilder(str1);      
      StringBuilder sb2=new StringBuilder(str2);      
      StringBuilder sb3=new StringBuilder(str3);      
      StringBuilder temp=new StringBuilder("");
      int length1=sb1.length();
      int length2=sb2.length();
      int length3=sb3.length();
      int i,j;
      for(i=0;i<=(length1-1)-(length2-1);i++)
      {
        boolean match=true;
        for(j=0;j<length2;j++)
        {
          if(sb1.charAt(i+j)!=sb2.charAt(j))
          {
            match=false;
          }
        }
        if(match==true)
        {
          String str=sb3.substring(0,length3);
            temp.append(str);
          i=i+(length2-1);
        }
        else
        {
          char ch=sb1.charAt(i);
          temp.append(ch);
        }
      }
      for(j=i;j<length1;j++)
      {
        char ch=sb1.charAt(j);
          temp.append(ch);
      }
      System.out.println(temp);
    }
}