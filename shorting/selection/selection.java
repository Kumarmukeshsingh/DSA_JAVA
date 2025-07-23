import java.util.Arrays;

public class selection {
   static int getMaxIndex(int[] arr, int start, int end) {
      int max = start;
      for (int i = start; i < end; i++) {
         if (arr[max] < arr[i]) {
            max = i;
         }
      }
      // System.out.print(arr[max] + " ");
      return max;
   }

   static int swap(int[] arr, int first, int second) {
      int temp = arr[first];
      arr[first] = arr[second];
      arr[second] = temp;
      return temp;
   }

   static void selection(int[] arr) {
      int n = arr.length;
      for (int i = 0; i < n-1; i++) {
         int last = arr.length - i - 1;
         int maxIndex = getMaxIndex(arr, 0, last);
         swap(arr, maxIndex, last);
      }
   }

   public static void main(String[] args) {
      int[] arr = { 2, 20, 53, 63, 7, 10, 3, 0, 90, 4, 8 };
      // int[] arr = { 2, 20, 53, 63, 7 };
      System.out.println(Arrays.toString(arr));
      System.out.println(getMaxIndex(arr, 0, arr.length - 1));
      selection(arr);
      System.out.println(Arrays.toString(arr));
      // for (int i : arr) {
      // System.out.print(i + " ");
      // }

   }
}
