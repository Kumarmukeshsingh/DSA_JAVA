
import java.util.Arrays;

public class insertion {
   public static void insertionsort(int[] arr) {
      int n = arr.length;
      for (int i = 1; i < n; i++) {
         int j = i;
         System.out.println(j);
         while (j > 0 && arr[j] < arr[j - 1]) {
// arr[j]  sweap arr[j-1]
            int temp = arr[j];
            arr[j] = arr[j - 1];
            arr[j - 1] = temp;
            j--;
         }
      }
   }

   public static void main(String[] args) {
      int[] arr = { 4, 6, 3, 2, 16, 7 };
      System.out.println(Arrays.toString(arr));
      insertionsort(arr);
      System.out.println(Arrays.toString(arr));
   }
}
