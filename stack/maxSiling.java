import java.util.Arrays;
import java.util.Stack;

public class maxSiling {

   public static void main(String[] args) {
      int[] nums = { 1, 3, -1, -3, 5, 3, 6, 7 };
      int k = 3;
       
      

      for (int i : nums) {
         System.out.println(i);
      }
   }

   public int[] maxSlidingWindow(int[] nums, int k) {
      int n = nums.length;
      int z = 0;
      int[] ans = new int[n - k + 1];
      Stack<Integer> st = new Stack<>();
      int[] nge = new int[n];// next grater element
      st.push(n - 1);
      nge[n - 1] = n;
      for (int i = n - 2; i >= 0; i--) {
         while (st.size() == 0 && nums[i] > nums[st.peek()])
            st.pop();
         if (st.size() == 0)
            nge[i] = n;
         else
            nge[i] = st.peek();
         st.push(i);
      }
      int j = 0;
      for (int i = 0; i < n - k + 1; i++) {
         if (j >= i + k)
            j = i;
         int max = nums[j];
         while (j < i + k) {
            max = nums[j];
            j = nge[j];
         }
         ans[z++] = max;
      }

      return ans;

   }

}
