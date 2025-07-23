import java.util.Scanner;

public class taking_input_array {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number of elememt:");
      int n = sc.nextInt();
      int[] arr = new int[n];
      System.out.println("entr the array " + n + "element:");
      for (int i = 0; i < arr.length; i++) {
         arr[i] = sc.nextInt();
      }
      for (int i = 0; i < n; i++) {
         System.out.println(" element " + arr[i] + "");
      }
   }

}
