public class travers {
    public static void main(String[] args) {
        
 int [] ages = new int[5];
  ages [0]=23;
     ages [1]=24;    
      ages [2]=25;
       ages [3]=26;
        ages [4]=27;

        // for loop
        // we can print limited array
        for (int i = 0; i < 5; i++) {
            System.out.println(ages[i]);

        }

         System.out.println("...............");
            //for each loop
            // we can print all data of an array
            for (int age : ages) {
            System.out.println(age);
        }
    }
}
