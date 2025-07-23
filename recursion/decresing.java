
public class decresing {
   public static void main(String[] args) {
      dec(6);
   }

   static int dec(int n) {
      if (n == 1) {
         System.out.println(n);
         return n;
      }
      System.out.println(n);
      int ans = dec(n - 1);
      return ans;

   }

}
