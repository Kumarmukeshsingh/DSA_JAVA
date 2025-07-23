import java.util.Arrays;

public class overloadig {
   public static void main(String[] args) {
      //  fun(10,10,29);
      fun("mukesh");
      sum(10,20,30,40);
   }

   static void fun(int a) {
      System.out.println(a);
   }

   static void fun(String name) {
      System.out.println(name);
   }

   static void sum(int...v){
      System.out.println(Arrays.toString(v));
   }

}
