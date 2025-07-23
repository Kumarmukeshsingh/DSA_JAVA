import java.util.Scanner;

public class tringle {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      float area, base, height;
      System.out.println("Enter base of traingle");
      base = in.nextFloat();
      System.out.println("enter hight of  trangle");
      height = in.nextFloat();
      area = 0.5f * base * height;
      System.out.println("Area of tringle=" + area);
   }

}
