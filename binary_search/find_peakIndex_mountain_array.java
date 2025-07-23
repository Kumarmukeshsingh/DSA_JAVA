public class find_peakIndex_mountain_array {
   public static void main(String[] args) {
      int[] arr = { 11, 12, 13, 14, 15, 17, 16, 13, 12 };
            //     { 0  1   2    3   4   5   6   7   8 }
      // int[] arr = { 1, 2, 4, 3, 2, 1 };
      int result = peakIndex(arr);
      System.out.println(result);

   }

   public static int peakIndex(int[] arr) {
      int start = 0;//
      int end = arr.length - 1;
      while (start < end) {
         int mid = start + (end - start) / 2; // 4{15} 6{16} 5{17}
         System.out.println(arr[mid]);

         if (arr[mid] > arr[mid + 1]) {
            end = mid;
         } else {// arr[mid]<arr[mid+1]
            start = mid + 1;
         }
      }

      // return arr[start];//return index value
      return start;   // return only index
   }
}
