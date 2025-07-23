public class minimum_possible_total_cost {

   static int best(int[] h, int n, int idx) {

      if (idx == n - 1) {
         return 0;
      }
      int op1 = Math.abs(h[idx] - h[idx + 1]) + best(h, n, idx + 1);
      System.out.println(op1);
      if (idx == n - 1) {
         return op1;
      }
      int op2 = Math.abs(h[idx] - h[idx + 1]) - best(h, n, idx + 2);
      return Math.min(op1, op2);
   }
      public static void main(String[] args) {
      int[] h = { 10, 20, 40, 30 };
      int n = h.length;
      System.out.println(best(h, n, 0));
   }
}
