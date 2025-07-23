import java.util.Arrays;

public class searching_in_a_string {

   public static void main(String[] args) {
      String name = "mukesh";
      char target = 'o';
      System.out.println(search(name, target));
      // System.out.println(Arrays.toString(name.toCharArray));
   }

   static boolean search(String name, char target) {

      if (name.length() == 0) {
         return false;
      }

      for (int i = 0; i < name.length(); i++) {

         if (target == name.charAt(i)) {
            return true;
         } else {

            return false;
         }
      }

      // for (String str : str.toCharArray()) {
      // if (str.equals(target)) {
      // return true;
      // }
      // }

      // return false;
   }
}