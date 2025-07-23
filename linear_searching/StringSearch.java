public class StringSearch {

   public static int search(String s, char target) {
      if (s.length() == 0) {
         return -1;
      }

      for (int i = 0; i < s.length(); i++) {
         if (s.charAt(i) == target) {
            return i;
         }
      }
      return -1;
   }

   public static void main(String[] args) {

      String s = "mukesh";
      char target = 'e';
      System.out.println(search(s, target));

   }

}
