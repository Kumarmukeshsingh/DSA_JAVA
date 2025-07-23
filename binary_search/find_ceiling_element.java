public class find_ceiling_element {
   public static void main(String[] args) {
      int arr[] = { 2, 3, 5, 9, 14, 16, 18 };
      int target = 20;
      int ans = ceilig(arr, target);
      System.out.println(ans);

   }

   // same as a floor of a number
   static int ceilig(int arr[], int target) {
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
      return start;
   }

}
