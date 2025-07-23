public class p15 {
   public static void main(String[] args) {
      int n = 5;
      int x;
      int y;
      for (int i = 1; i <= n; i++) {
         x = i;
         y = n - i + 1;
         for (int j = 1; j <= n; j++) {
            if (j % 2 == 0) {
               System.out.printf("%3d", x);// 6 20
            } else {
               System.out.printf("%3d", y);// 5 15 25
            }
            x = n + x;// 6 11 16  21
            y = n + y;// 10 15 20  25

         }
         System.out.println();
      }
   }

}
