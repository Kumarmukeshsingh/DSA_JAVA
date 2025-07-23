
public class p9 {
   public static void main(String[] args) {
      int n = 100;
      for (int i = 1; i <= n; i++) {
         for (int j = 1; j <= n; j++) {
            System.err.printf("%2d", (i * j));
         }
         System.out.println();
      }
   }

}
