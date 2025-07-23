public class p18 {

   public static void main(String[] args) {
      int n = 5;
      char ch = 'A';

      for (int i = 1; i <= n; i++) {
         for (int j = 1; j <= n; j++) {
            System.out.print(ch + " ");
            if (ch < 'Z') {
               ch++;
            } else {
               ch = (char) 'A';
            }
         }
         System.out.println();
      }
   }
}