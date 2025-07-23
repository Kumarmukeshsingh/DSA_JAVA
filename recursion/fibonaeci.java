// NOTE fibonacei series is := 0 1 1 2 3 5 8 13.............
public class fibonaeci {
   // public static void main(String[] args) {
   // int result = fib(5);
   // System.out.println(result);
   // }
   public static void main(String[] args) {
      for (int i = 0; i <= 10; i++) {
         System.out.print(fib(i) + " ");
      }
   }

   static int fib(int n) {
      if (n == 0 || n == 1) {
         return n;
      }
      // fibonaeci= f(n-1)+f(n-2)
      int prev = fib(n - 1);
      int preprev = fib(n - 2);
      int ans = prev + preprev;
      // System.out.println(ans);
      return ans;

   }
}
