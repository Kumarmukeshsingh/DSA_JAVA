public class infinite_Array {
   public static void main(String[] args) {
      int[] arr = { 2, 3, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
      int target = 5;
      int result = ans(arr, target);
      System.out.println(result);
   }

   static int ans(int[] arr, int target) {

      // int start = 0;
      // int end = 1;
      // while (target > arr[end]) {
      // // int temp = end + 1; // this is my new start
      // end = end + (end - start + 1) * 2; // end=privioius end + size of box * 2 // duble the box value
      // start = end + 1;
      // }

      int start = 0;
      int end = 1;
      while (target > arr[end]) {
         start = end;
         start = 2 * start;
      }
      return  binarySearch(arr, start, end, target)
   }

   static int binarySearch(int[] arr,  int start, int end,int target,) {
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
