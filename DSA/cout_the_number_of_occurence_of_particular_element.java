import java.util.Scanner;

public class cout_the_number_of_occurence_of_particular_element {
   static int countoccurence(int[] arr, int x) {
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
      System.out.println("enter the size of array ");
      int n = sc.nextInt();

      int[] arr = new int[n];
      System.out.println("enter " + n + "  element");
      for (int i = 0; i < arr.length; i++) {
         arr[i] = sc.nextInt();
      }

      System.out.println("enter x to find the number of occurence of number ");
      int x = sc.nextInt();
      System.out.println("count of x  is :" + countoccurence(arr, x));
   }
}
