public class sum_of_all_subset {
   static void subsetsum(int[] a, int n, int idx, int sum) {
      if (idx >= n) {
         System.out.println(sum);
         return;
      }
      subsetsum(a, n, idx + 1, sum);
      subsetsum(a, n, idx + 1, sum + a[idx]);
   }

   public static void main(String[] args) {
      int[] a = { 2, 4, 5 };
      int n = a.length;
      subsetsum(a, n, 0, 0);
      // System.out.println(subsetsum(a, n, 0, 0));
   }
}
