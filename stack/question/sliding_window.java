
import java.util.Arrays;
import java.util.Stack;

public class sliding_window {
   public static void main(String[] args) {

      int[] num = { 1, 3 - 1, -3, 5, 3, 6, 7 };
      int k = 3;
      // maxslidingWindow2(num, k);
      System.out.println(Arrays.toString(maxslidingWindow2(num, k)));

   }

   // public static int[] maxslidingWindow(int[] num, int k) {
   // int n = num.length;
   // // n-(n-k)=n-k+1;]
   // int[] ans = new int[n - k + 1];
   // int z = 0;
   // for (int i = 0; i < n - k + 1; i++) {
   // int max = Integer.MIN_VALUE;
   // for (int j = i; j < i + k; j++) {
   // max = Math.max(max, num[j]);
   // }
   // ans[z] = max;
   // z++;
   // }
   // return ans;
   // }

   public int[] maxslidingWindow2(int[] num, int k) {
      int z = 0;
      int n = num.length;
      Stack<Integer> st = new Stack<>();
      int[] neg = new int[n];
      st.push(n - 1);
      neg[n - 1] = n;

      for (int i = n - 2; i >= 0; i--) {
         while (st.size() > 0 && num[i] > num[st.peek()]) {
            st.pop();
         }
         if (st.size() == 0)
            neg[i] = n;
         else
            neg[i] = st.peek();
         st.push(i);
      }
      int j = 0;
      for (int i = 0; i < n - k + 1; i++) {
         if (j >= i + 1)
            j = i;
         int max = num[j];
         while (j < i + k) {
            max = num[j];
            j = neg[j];
         }
         neg[z++] = max;
      }
      System.out.println(neg);
      return neg;
   }
}
