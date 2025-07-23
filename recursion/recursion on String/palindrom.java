import java.util.Scanner;

public class palindrom {

   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
      String rev = paindroms(s, 0);
      System.out.println(" rev string is" + rev);

      if (s.equals(rev)) {
         System.out.println("yes");
      } else {
         System.out.println("no");
      }
   }

   static String paindroms(String s, int idx) {
      if (idx == s.length()) {
         return " ";
      }
      String smallans = paindroms(s, idx + 1);
      System.out.println(" small ans " + smallans + s.charAt(idx));
      return smallans + s.charAt(idx);

   }
}