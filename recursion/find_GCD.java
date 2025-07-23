public class find_GCD {// greatest common diviser
   public static void main(String[] args) {
      int x = 16; // 1,2,4,8,16;
      int y = 12; // 1,2,3,4,6,12;
      // comon= 1,2,4
      // grater= 4 so output= 4
      System.out.println(gcd(x, y));

   }

   static int gcd(int x, int y) {
      if (y == 0) {
         return x;
      }
      return gcd(y, x % y);
   }
}
