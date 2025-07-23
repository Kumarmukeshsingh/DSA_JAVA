import java.util.Scanner;

public class Rectangle {
   int height;
   int width;
   int area;

   void area() {
      area = height * width;
      System.out.println("area of rectange=" + area);
   }

   public static void main(String[] args) {
      Rectangle obj = new Rectangle();
      obj.height = 10;
      obj.width = 20;

      obj.area();
   }
}
