import java.util.Scanner;

public class arrinput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int [7];
          System.out.print("Enter array element :");
 for (int i = 0; i < arr.length; i++) {
     arr[i] = sc.nextInt();
 }
 
          System.out.print("Displaying ther arry :");
          for (int i = 0; i < arr.length; i++) {
    System.out.print(arr[i]+" ");
 }
           }
}
