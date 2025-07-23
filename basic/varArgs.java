import java.util.Arrays;

public class varArgs {
   public static void main(String[] args) {
      fun(3, 45, 64, 34, 32, 565, 64, 32, 22);
      multiple(3, 40, "mukehs", "krishna");
      demo(10, 20, 30);

      demo("radha", "krishna");
   }

   static void demo(int... v) {
      System.out.println(Arrays.toString(v));
   }

   static void demo(String... v) {
      System.out.println(Arrays.toString(v));
   }

   static void multiple(int a, int b, String... v) {
      System.out.println(Arrays.toString(v));

   }

   static void fun(int... v) {
      System.out.println(Arrays.toString(v));// storing all the element in a arry format
   }
}
