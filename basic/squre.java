public class squre {
   private static int getSqure(int x) {
      return x * x;
   }

   public static void main(String[] args) {
      for (int i = 0; i <= 10; i++) {

         int result = getSqure(i);
         System.out.println("the squre of" + i + "is:" + result);
      }
   }
}
