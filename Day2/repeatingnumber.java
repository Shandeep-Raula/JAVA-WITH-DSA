import java.util.Scanner;



public class repeatingnumber {

static int repeatnum(int []arr){
 for (int i = 0; i < arr.length; i++) {
    for (int j = i+1; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
            return arr[i];
        }
    }
 }
return -1;
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



System.out.println("Repeated number : "+repeatnum(arr));

    }
}
