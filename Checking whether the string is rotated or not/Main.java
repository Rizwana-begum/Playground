import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();
        StringBuilder sb1 = new StringBuilder(str1);
        StringBuilder sb2 = new StringBuilder(str2);
        StringBuilder temp = new StringBuilder("");
        int len1 = sb1.length();
        int len2 = sb2.length();
        for(int i= 0; i <len1; i++){
            char ch = sb1.charAt(i);
            temp.append(ch);     
        }
        for(int j = 0; j<len1;j++){
            char ch = sb1.charAt(j);
            temp.append(ch);     
        }
        int len = temp.length();
        int index = substring_searching(temp,len, sb2,len2);
        if(index != -1){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
    public static int substring_searching(StringBuilder str1, int len1, StringBuilder str2, int len2)
    {
        int match= -1;
        for (int i = 0; i < (len1 - len2+ 1); i++)
        {
            boolean matching = true;
            for(int j = 0; j < len2; j++)
            {
                if(str1.charAt(i + j) != str2.charAt(j))
                {
                    matching = false;
                }
            }
            if(matching == true)
            {
                match = i;
                break;
            }
        }
        return match;
    }
}