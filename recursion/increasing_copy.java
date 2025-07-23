
class increasing_copy {

   static int increasing(int n) {
      if (n == 0) {
         System.out.println(n);
         return n;
      }
      System.out.println(n);
      int ans = increasing(n - 1);
      return ans;

   }

   public static void main(String[] args) {
      increasing(6);
   }
}