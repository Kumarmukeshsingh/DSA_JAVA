import java.util.Arrays;
import java.util.Stack;

public class Next_grater {

   public static void main(String[] args) {
      int[] arr = { 1, 3, 2, 1, 8, 6, 3, 4 };
      nextGrater(arr);

   }

   public static void nextGrater(int[] arr) {
      int n = arr.length;
      int[] res = new int[n];
      Stack<Integer> st = new Stack<>();
      res[n - 1] = -1;
      st.push(arr[n - 1]);
      for (int i = n - 2; i <= 0; i--) {

         while (st.peek() <= arr[i] && st.size() > 0) {
            st.pop();

         }

         if (st.size() == 0) {
            res[i] = -1;
         } else {
            res[i] = st.peek();
         }

         st.push(arr[i]);
      }

      System.out.println(Arrays.toString(res));
   }

}