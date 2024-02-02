import java.util.Scanner; 

public class New {
    public static void main(String[] args) {
      
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter size :");
  int n = sc.nextInt();
  int []age = new int[n];
    
  System.out.println("Enter element of an array :");
      for (int i = 0; i < n; i++) {
            age[i] = sc.nextInt(); 
      }

      System.out.println("Display the array :");
    
      for (int i = 0; i < n; i++) {
            System.out.println(age[i]+" ");
      }
    }
}
