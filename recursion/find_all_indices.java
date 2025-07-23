public class find_all_indices {
   public static void main(String[] args) {
      int arr[] = { 1, 2, 3, 2, 2, 5 };
      int n = arr.length;
      int target = 2;
      findallIndices(arr, n, target, 0);
      System.out.println(findallIndices(arr, n, target, 0));
   }

   static void findallIndices(int[] arr, int n, int target, int idx) {
      if (idx >= n) {
         return;
      }
      if (arr[idx] == target) {
         System.out.print(idx + "  ");
      }
      findallIndices(arr, n, target, idx + 1);
   }
}
