
public class find_max_number {
   public static void main(String[] args) {
      int arr[] = { -18, -12, -4, 0, 2, 3, 10, 15, 89 };
      int target = 10;
      int ans = binary(arr, target);
      System.out.println(ans);

   }

   static int binary(int arr[], int target) {
      int start = 0;
      int end = arr.length - 1;
      while (start <= end) {
         int mid = start + (end - start) / 2;
         if (target < arr[mid]) {
            end = mid - 1;
         } else if (target > arr[mid]) {
            start = mid + 1;
         } else {
            return mid;
         }
      }
      return -1;
   }
}
