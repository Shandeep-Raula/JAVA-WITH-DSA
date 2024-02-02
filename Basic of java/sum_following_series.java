// 1-2+3-4+5-6......n

import java.util.Scanner;
 public class sum_following_series{
    public static void main(String[] args) {
 
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i =1;
        int ans= 0;


   while (i<=n) {
    if (i%2==0) {
        ans-=i;
    }else{
        ans+=i;

     }
    i++;
}


System.out.println(ans);
    }
 }