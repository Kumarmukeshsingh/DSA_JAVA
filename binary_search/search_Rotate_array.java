public class search_Rotate_array {
   // search in sorted rotated array

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

   static int findpivat(int[] arr) {
      int start = 0;
      int end = arr.length - 1;
      while (start <= end) {
         int mid = start + (end - start) / 2;

         if (mid < end && arr[mid] > arr[mid + 1]) {
            return mid;
         }
         if (mid > start && arr[mid] > arr[mid + 1]) {
            return mid - 1;
         }
         if (arr[mid] <= arr[start]) {
            end = mid - 1;
         } else {
            start = mid + 1;
         }
      }
      return -1;
   }

   static int search(int[] nums, int target) {
      int pivat = findpivat(nums);
      // if you did not find a pivat , its mains the array is not rotated
      if (pivat == -1) {
         return binarySearch(nums, target, 0, nums.length - 1);
      }
      // if pivat is found you have found asending sorted arrays.
      if (nums[pivat] == target) {
         return pivat;
      }

      if (target >= nums[0]) {
         return binarySearch(nums, target, 0, pivat - 1);
      }
      return binarySearch(nums, target, pivat + 1, nums.length - 1);
   }

   public static void main(String[] args) {

      int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
      // System.out.println(findpivat(arr));
      System.out.println(search(arr, 5));

   }
}
