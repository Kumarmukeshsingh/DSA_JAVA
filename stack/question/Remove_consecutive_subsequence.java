import java.util.Stack;

public class Remove_consecutive_subsequence {

   public static int[] remove(int[] arr) {
      Stack<Integer> st = new Stack<>();
      int n = arr.length - 1;

      for (int i = 0; i < n; i++) {
         if (st.size() == 0 || st.peek() != arr[i]) {
            st.push(arr[i]);
         } else if (arr[i] == st.peek()) {
            if (i == n - 1 || arr[i] != arr[i + 1]) {
               st.pop();
            }
         }

      }
      int[] res = new int[st.size()];
      int m = res.length;
      for (int j = m - 1; j > 0; j--) {
         res[j] = st.pop();

      }
      return res;

   }

   public static void main(String[] args) {

      int[] arr = { 1, 2, 3, 3, 3, 4, 5, 6, 6, 6 };
      int[] res = remove(arr);
      for (int i = 0; i < res.length; i++) {
         System.out.print(res[i] + " ");
      }

   }
}
