
import java.util.Arrays;

public class bubblesort {
   static void bubble(int[] arr) {
      // boolean swapped;
      for (int i = 0; i < arr.length; i++) {
         // swapped = false;
         // this step , max item will come at the last respective index
         for (int j = 1; j < arr.length; j++) {

            // swap if the item is smaller then the previous item;
            if (arr[j] < arr[j - 1]) {
               int swap = arr[j];
               arr[j] = arr[j - 1];
               arr[j - 1] = swap;
               // swapped = true;
            }

         }
         // if (!swapped) {
         // break;
         // }
      }
   }

   public static void main(String[] args) {
      int[] arr = { 1, 3, 4, 6, 5, 10, 100, 2, 3, 4, 7 };
      System.out.println(Arrays.toString(arr));
      bubble(arr);
      System.out.println(Arrays.toString(arr));
   }

}
