import java.util.Scanner;

public class count_number_of_occurence {

   static int countOccurence(int[] arr, int x) {
      int count = 0;
      for (int i = 0; i < arr.length; i++) {
         if (arr[i] == x) {
            count++;
         }
      }
      return count;
   }
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("enter the size of array");
      int n = sc.nextInt();
      int[] arr = new int[n];
      System.out.print("enter" + n + "element");
      for (int i = 0; i < arr.length; i++) {
         arr[i] = sc.nextInt();
      }
      System.out.println("enter x");
      int x = sc.nextInt();
      System.out.println("count of x:" + countOccurence(arr, x));
   }

}
