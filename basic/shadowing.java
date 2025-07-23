public class shadowing {
   static int x = 90;// this will be shadowed at fun() at line 10

   public static void main(String[] args) {
      System.out.println(x);// otuput=90

      // scope will beging when value is initialised
      int x = 40;
      System.out.println(x);// output=40
      fun();

   }

   static void fun() {
      System.out.println(x);// 40
   }
}