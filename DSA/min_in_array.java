public class min_in_array {
   void minofarray() {
      int[] arr = { 10, 4, 6, 3, -8, 3, 9, -100 };
      int ans = arr.length;

      for (int i = 0; i < arr.length; i++) {
         // System.out.println(arr[i]);
         if (arr[i] < ans) {
            ans = arr[i];
         }
      }
      System.out.println("min number in array:" + ans);
   }

   public static void main(String[] args) {
      min_in_array obj = new min_in_array();
      obj.minofarray();
   }

}
