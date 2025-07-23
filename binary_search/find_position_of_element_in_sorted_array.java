// find the positon of sorted arryas 

class find_position_of_element_in_sorted_array {
   public static void main(String[] args) {
      int[] arr = { 3, 5, 7, 9, 10, 90, 100, 130, 140, 170 };
      int target = 90;
      System.out.println(ans(arr, target));
   }

   static int ans(int[] arr, int target) {
      int start = 0;
      int end = 1;
      // condition for target to lie in the rage
      while (target > arr[end]) {
         int temp = end + 1;
         // end =previous end+ size of box *2;
         end = end + (end - start + 1) * 2;
         start = temp;
      }
      return binarySearch(arr, target, start, end);
   }

   static int binarySearch(int[] arr, int target, int start, int end) {
      while (start <= end) {
         // find the middle elememt
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