
import java.util.Scanner;

public class add {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int a, b, c;
      System.out.println("enter first number");
      a = in.nextInt();
      System.out.println("enter second number");
      b = in.nextInt();
      c = a + b;
      System.out.println("add=" + c);
   }

}
