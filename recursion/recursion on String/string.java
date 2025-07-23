import java.util.Scanner;

public class string {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
      for (int i = 0; i < s.length(); i++) {
         System.out.print(s.charAt(i) + " ");
      }
      System.out.println(s.substring(0, 6));
   }

}
