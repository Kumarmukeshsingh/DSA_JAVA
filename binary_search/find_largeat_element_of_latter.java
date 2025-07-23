public class find_largeat_element_of_latter {
   public static void main(String[] args) {
      char letter[] = { 'a', 'r', 'z' };
      char target = 'r';
      char ans = nextgraterletter(letter, target);
      System.out.println(ans);

   }

   static char nextgraterletter(char[] letter, char target) {
      int start = 0;
      int end = letter.length - 1;
      while (start <= end) {
         int mind = start + (end - start) / 2;
         if (target < letter[mid]) {
            end = mid - 1;
         } else {
            start = mid + 1;
         }
      }
      return letter[start % letter.length];
   }
}
