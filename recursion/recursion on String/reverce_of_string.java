import java.util.Scanner;

public class reverce_of_string {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
      String result = reverse(s, 0);
      System.out.println(result);
   }

   static String reverse(String s, int idx) {
      if (idx == s.length()) {
         return "";
      }
      String smallans = reverse(s, idx + 1);
      return smallans + s.charAt(idx);
   }
}
