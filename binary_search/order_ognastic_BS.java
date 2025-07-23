
public class order_ognastic_BS {
   public static void main(String[] args) {
      // int arr[] = { 99, 80, 50, 30, 20, 10, 5 };
      int arr[] = { 2, 3, 4, 5, 6, 7, 8, 10 };
      int target = 10;
      int ans = orderOgnastic(arr, target);
      System.out.println(ans);
   }

   static int orderOgnastic(int arr[], int target) {
      int start = 0;
      int end = arr.length - 1;
      boolean isAsc = arr[start] < arr[end];
      System.out.println(isAsc);

      while (start <= end) {
         int mid = start + (end - start) / 2;

         if (arr[mid] == target) {
            return mid;
         }
         
         if (isAsc) {
            if (target < arr[mid]) {
               end = mid - 1;
            } else {
               start = mid + 1;
            }
         } else {
            if (target > arr[mid]) {
               end = mid - 1;
            } else {
               start = mid + 1;
            }
         }
      }
      return -1;

   }
}
