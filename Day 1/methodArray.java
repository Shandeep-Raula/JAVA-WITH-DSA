import java.util.Scanner; 
public class methodArray {

static void printarray(int[]age){
      for (int i = 0; i < age.length; i++) {
            System.out.println(age[i]);
      }
      System.out.println();
}

    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);

       

  int []age = new int[5];
  age [0]=23;
  age [1]=24;    
   age [2]=25;
    age[3]=26;
     age [4]=27;
     

printarray(age);

int ages[] =age;

printarray(ages);

      }
    }

