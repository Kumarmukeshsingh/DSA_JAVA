public class override {
   final int x = 10;

   public static void main(String[] args) {
      override obj = new override();
      System.out.println(obj.x);
      // obj.x = 200;         because final value assign 
      // System.out.println(obj.x);
   }
}
