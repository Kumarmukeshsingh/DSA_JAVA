public class print_array{
   public static void main(String[] args) {
      int arr[] = { 5, 6, 7, 8 };
      printArray(arr,0);

   }

   static void printArray(int[] arr, int idx) {
      if (idx == arr.length) {
         return;
      }
      System.out.println(arr[idx]);
      printArray(arr, idx + 1);

   }
}
