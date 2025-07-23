import java.util.Scanner;

public class Perimeter {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      float Perimeter, height, width;
      System.out.println("Enter height of rectangle:");
      height = in.nextInt();
      System.out.println("enter width of rectangle:");
      width = in.nextInt();
      Perimeter = 2 * (height + width);
      System.out.println("perimeter of rectangle is =" + Perimeter);
   }

}
