public class max_in_array {
   void maxofarray() {
      int[] arr = { 1, 5, 63, 7, 33, 88 };
      int ans = 0;
      for (int i = 0; i < arr.length; i++) {
         if (arr[i] > ans) {
            ans = arr[i];
         }
      }
      System.out.println("maximum number of given array:-" + ans);
   }
   // public class main {
   public static void main(String[] args) {
      max_in_array obj = new max_in_array();
      obj.maxofarray();
   }

   // }
}
