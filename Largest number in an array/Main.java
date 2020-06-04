import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in=new Scanner(System.in);
      int arr_size=in.nextInt();
      int arr[]=new int[arr_size];
      int largest,i;
      for(i=0;i<=arr_size-1;i++)
      {
        arr[i]=in.nextInt();
      }
      largest = arr[0];
 
        for (i = 1; i <arr_size; i++) 
        {
		if (largest < arr[i])
			largest = arr[i];
        }
      System.out.println(largest);
	}
      
    }
