import java.util.Scanner;

public class findmax {

    static int findmax(int arr[]){
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
         if (arr[i]>max) {
            max = arr[i];
         }
        }
        return max;
    }
    
    static void prtintarray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
        public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          
          System.out.println("Enter size of an array : ");
          int n = sc.nextInt();
    
          int arr[] = new int[n];
    
    
          System.out.println("Enter array element :");
          for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
          } 
    System.out.println("Array is : ");
    prtintarray(arr);
    
    
 
    System.out.println("Maximum value :"+findmax(arr));
        }
    }
    