public class recursion {

   public static int calfactorial(int n) {
      if (n == 1 || n == 0) {
         return 1;
      }
      int fact_n1 = calfactorial(n - 1);
      System.out.println(fact_n1);
      int fact_n = n * fact_n1;
      // System.out.println(fact_n);
      return fact_n;

   }

   public static void main(String[] args) {
      int n = 5;
      int ans = calfactorial(n);
      System.out.println(ans);
      // System.out.println(calfactorial(5));
   }
}
