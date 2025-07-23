public class split_array_largest_sum {

   static int splitarry(int[] arr, int m) {
      int start = 0;

      int end = 0;
      for (int i = 0; i < arr.length; i++) {
         start = Math.max(start, arr[i]);// 7 7 7 10 10
         // System.out.println(start);
         end += arr[i];
         System.out.println(end);
      }
      // binary search
      while (start < end) {
         // try for the middle as potential ans
         int mid = start + (end - start) / 2;

         // calculate how many pices you can divide this in with this max sum;

         int sum = 0;
         int pices = 1;
         for (int num : arr) {
            if (sum + num > mid) {
               sum = num;
               pices++;
            } else {
               sum += num;
            }
         }

         if (pices > m) {
            start = mid + 1;
         } else {
            end = mid;
         }
      }
      return end;
   }

   public static void main(String[] args) {
      int[] arr = { 7, 2, 5, 10, 8 };
      int m = 2;
      System.out.println(splitarry(arr, m));
   }
}