import java.util.Scanner;

class try_catch {
   public static void main(String[] args) {
      Scanner obj = new Scanner(System.in);
      int a, b, c;
      try {
         System.out.println("enter first Number ");
         b = obj.nextInt();
         System.out.println("enter second number");
         c = obj.nextInt();
         a = b / c;
         System.out.println("Dev=" + a);

      } catch (Exception e) {
         // TODO: handle exception
         System.out.println("error" + e);
      }
   }
}