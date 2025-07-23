public class Power_of_number {
   public static void main(String[] args) {
      int ans = pow(4, 2);
      int ans2 = power(3, 3);
      System.out.println(ans2); //P^q=
   }

   static int pow(int p, int q) {
      if (q == 0)
         return 1;
      return pow(p, q - 1) * p;
   }

   static int power(int p, int q) {
      if (q == 0)
         return 1;
      int smallpow = power(p, q / 2);
      if (q % 2 == 0) {
         return smallpow * smallpow;
      } else {
         return p * smallpow * smallpow;
      }
   }
}
