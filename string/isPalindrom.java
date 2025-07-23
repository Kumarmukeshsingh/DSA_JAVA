public class isPalindrom {
   public static boolean IsPalindroms(String s) {
      int i = 0;
      int j = s.length() - 1;
      while (i < j) {
         if (s.charAt(i) != s.charAt(j))
            return false;
         i++;
         j--;
      }
      return true;
   }

   // public static void main(String[] args) {
   // String s = "abbc";
   // boolean ans = IsPalindroms(s);
   // if (ans == true) {
   // System.out.println("p...");
   // } else {
   // System.out.println("not...");
   // }

   // }

   public static void main(String[] args) {
      String s = "abbc";
      int count = 0;
      for (int i = 0; i < s.length(); i++) {
         for (int j = i + 1; j <= s.length(); j++) {
            if (IsPalindroms(s.substring(i, j)) == true) {
               System.out.print(s.substring(i, j) + " ");
               count++;
            }
         }
      }
      System.out.println();

      System.out.println(" palindrom substring count is :" + count);
   }
}
