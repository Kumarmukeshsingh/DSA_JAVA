class sum_of_array {
   static int sumofarray() {
      int[] arr = { 1, 4, 5, 6, 1 };// output =17
      int sum = 0;
      for (int i = 0; i < arr.length; i++) {
         sum = sum + arr[i];
      }
      return sum;
      // System.out.println(sum);

   }

   public static void main(String[] args) {
      // sum_of_array obj = new sum_of_array();
      // obj.sumofarray();
      
      System.out.println(sumofarray());

   }

}