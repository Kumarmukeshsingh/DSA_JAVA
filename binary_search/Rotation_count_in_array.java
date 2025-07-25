public class Rotation_count_in_array {

   static int findpivat(int[] arr) {
      int start = 0;
      int end = arr.length - 1;
      while (start <= end) {
         int mid = start + (end - start) / 2;

         if (mid < end && arr[mid] > arr[mid + 1]) {
            return mid;
         } else if (mid > start && arr[mid] < arr[mid - 1]) {
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

   static int countRoation(int[] arr) {
      int pivat = findpivat(arr);
      return pivat + 1;
   }

   public static void main(String[] args) {
      int[] arr = { 3, 4, 5, 6, 7, 8, 0, 1, 2 };
      System.out.println(" the pavit index   is : " + findpivat(arr));
      int ans = countRoation(arr);
      System.out.println("rotation count of array : " + ans);

   }
}
