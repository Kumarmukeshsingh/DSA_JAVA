import java.util.Scanner;


// square of two number in java

public class squre {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int area, side;
      System.out.println("ente side");
      side = in.nextInt();
      area = side * side;
      System.out.println("Area od squre=" + area);
   }

}
