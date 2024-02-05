

public class reverseArra {

    static void prtintarray(int []arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    static void reverseArra(int []arr){
        int n = arr.length;
         int [] ans = new int[n];
         int j = 0;
         //Reverse the orignal array
        for (int i = n-1; i >= 0; i--) {
            ans[j++] = arr[i];
        }
    }
   
        public static void main(String[] args) {
      
int [] arr = {1,2,3,4,5};
int [] ans = reverseArra(arr);
prtintarray(arr);
        }
    }
    