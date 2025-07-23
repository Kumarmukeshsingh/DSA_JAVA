public class find_sum_of_array {
   public static void main(String[] args) {
      int arr[] = { 5, 6, 1, 8 };
      System.out.println(sumofarray(arr, 0));
   }

   static int sumofarray(int[] arr, int idx) {
      if (idx == arr.length) {
         return 0;
      }
      int smallans = sumofarray(arr, idx + 1);
      return smallans + arr[idx];
   }
}
