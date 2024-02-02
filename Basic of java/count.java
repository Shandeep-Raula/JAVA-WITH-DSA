import java.util.Scanner;


public class count {
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
     
int rev = 0;
while (n>0) {
   n=n/10;
   rev++;
}
System.out.println(rev);
   }
}
