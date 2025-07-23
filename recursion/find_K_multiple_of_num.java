import java.util.Scanner;

public class find_K_multiple_of_num {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      // int num = in.nextInt();// 12
      // int k = in.nextInt();// 5
      printMultiple(5, 5);// output=

   }

   static void printMultiple(int k, int num) {
      if (k == 1) {
         System.out.println(num);
         return;
      }

      printMultiple(k - 1, num);
      System.out.println(num * k);
   }

}
