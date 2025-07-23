public class parameter {
   static void changevalue(int a) {
      a *= 100;
      System.out.println("increase value:" + a);
   }

   public static void main(String[] args) {
      int a = 10;
      System.out.println("before change the value:-" + a);
      changevalue(a);    // not effect the vlaue of a
      System.out.println("after changing value :-" + a);
   }

}
