public class rotated_sorted_array {

   static int rotated(int[] arr, int target) {
      int start = 0;
      int end = arr.length - 1;

      while (start <= end) {
         int mid = start + (end - start) / 2;

         if (arr[mid] == target) {
            return mid;
         }
         if (arr[start] <= arr[mid]) {// left sortd
            if (arr[start] <= target && target <= arr[mid]) {
               end = end - 1;
            } else {
               start = mid + 1;
            }

         } else {/// right sorted

            if (arr[mid] <= target && target <= arr[end]) {
               start = mid + 1;
            } else {
               end = mid - 1;
            }
         }

      }
      return -1;
   }

   public static void main(String[] args) {
      int[] arr = { 3, 4, 5, 6, 7, 0, 1, 2 };
      int target = 0;
      int ans = rotated(arr, target);
      System.out.println(ans);

   }
}
