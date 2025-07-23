public class swap {
   public static void main(String[] args) {
      float first = 10.0f, second = 30.0f;
      System.out.println("before swap");
      System.out.println("first number=" + first);
      System.out.println("second number=" + second);
      // float temp = first;
      // first = second;
      // second = temp;
      first = first +  second;
      second = first - second;
      first = second  -first;
      System.out.println("after swap");
      System.out.println("first number=" + first);
      System.out.println("second number=" + second);
   }
}