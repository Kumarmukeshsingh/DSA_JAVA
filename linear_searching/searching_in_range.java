public class searching_in_range {
   public static void main(String[] args) {
      int arr[] = { 22, 45, 1, 2, 8, 19, -3, -11, 23 };
      int target = 45;
      // int ans = linearSearch(arr, target);
      // System.out.println(ans);
      System.out.println(linearSearch(arr, target, 1, 3));

   }

   static int linearSearch(int arr[], int target, int start, int end) {

      if (arr.length == 0) {
         return -1;// false
      }

      for (int i = start; i <= end; i++) {
         int element = arr[i];
         System.out.println(element);
         if (element == target) {
            return i;
         }
      }
       return -1;
   }
}
