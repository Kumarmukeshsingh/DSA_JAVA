public class p14 {
   public static void main(String[] argss) {
      int n = 5;
      int x;
      for (int i = 1; i <= n; i++) {
         x = n - i + 1;
         for (int j = 1; j <= n; j++) {
            System.out.printf("%3d", x); //{5 10 15 20 25} { 4 9 14 19 24}....
            x = x + n;
         }
         System.out.println();

      }
   }

}
