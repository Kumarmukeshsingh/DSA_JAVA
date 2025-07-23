public class sum_of_series {
   // series ex: 1+2+3+4

   public static void main(String[] args) {
      int n = 5;
      System.out.println(seriesSum(n));
   }

   static int seriesSum(int n) {
      if (n == 0) {
         return 0;

      }
      return seriesSum(n - 1) + n;
   }
}
