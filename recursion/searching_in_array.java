public class searching_in_array {
   public static void main(String[] args) {
      int arr[] = { 5, 6, 17, 8 };
      int target = 65;
      int n = arr.length;
      if (search(arr, n, target, 0)) {
         System.out.println("yes");
      } else {
         System.out.println("No");
      }
   }

   static boolean search(int[] arr, int n, int target, int idx) {
      if (idx >= n) {
         return false;
      }
      if (arr[idx] == target) {
         return true;
      }
      if (search(arr, n, target, idx + 1)) {
         return true;
      } else {
         return false;
      }
   }
}
