public class find_max {
   public static void main(String[] args) {
      int arr[] = { 5, 6, 17, 8 };
      System.out.println(max(arr, 0));
   }

   static int max(int[] arr, int idx) {
      if (idx == arr.length - 1) {

         return arr[idx];
      }
      int smallans = max(arr, idx + 1);
      return Math.max(smallans, arr[idx]); // find maximum element in a given array
      // return Math.min(smallans, arr[idx]); // find minimum element in a givern
      // array

   }
}
