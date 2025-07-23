import java.util.Arrays;
import java.util.Scanner;

public class binary {
   public static void main(String[] args) {
      // Scanner.in = new Scanner(System.in);

      int ar[] = { 12, 14, 13, 15, 16 };
      int key = 15;
      int result = Arrays.binarySearch(ar, key);
      if (result < 0)
         System.out.println("element is not found");
      else
         System.out.println("element is found at index:" + result);
   }
}