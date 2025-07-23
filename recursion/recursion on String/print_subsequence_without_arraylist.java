public class print_subsequence_without_arraylist {

   static void printssq(String s, String currans) {
      if (s.length() == 0) {
         System.out.println(currans);
         return;
      }
      char curr = s.charAt(0);// a
      String remString = s.substring(1); // bc
      //System.out.println(remString);
      printssq(remString, currans + curr);// bc ,a
      printssq(remString, currans);
   }

   public static void main(String[] args) {
      printssq("abc", " ");
   }
}
