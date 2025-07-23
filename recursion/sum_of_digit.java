public class sum_of_digit {
   public static void main(String[] args) {
      int n = 123;
      System.out.println(sod(n));
   }

   static int sod(int n) {
      if (n >= 0 && n <= 9) {
         return n;
      }
      int smallAns = sod(n / 10);
      int ans = smallAns + n % 10;
      return ans;
   }

}
