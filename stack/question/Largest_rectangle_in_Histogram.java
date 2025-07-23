package question;

import java.util.Stack;

public class Largest_rectangle_in_Histogram {
   public int largestRectangleArea(int[] height) {
      int n = height.length;
      Stack<Integer> st = new Stack<>();
      int[] nse = new int[n];
      int[] pse = new int[n];

      // calculating nse []
      st.push(n - 1); // index

      for (int i = n - 2; i >= 0; i--) {
         while (st.size() > 0 && height[st.peek()] >= height[i]) {
            st.pop();
         }
         if (st.size() == 0) {
            nse[i] = n;
         } else {
            nse[i] = st.peek();
            st.push(i);
         }

      }
      // stack is empty
      while (st.size() > 0) {
         st.pop();
      }

      // calculate psc[]
      st.push(0);
      pse[0] = -1;
      for (int j = 1; j < n - 1; j++) {
         while (st.size() > 0 && height[st.peek()] >= height[j]) {
            st.pop();
            if (st.size() == 0) {
               pse[j] = -1;
            } else {
               pse[j] = st.peek();
               st.push(j);
            }
         }

      }

      // maximum area of rectangle
      int max = -1;
      for (int i = 0; i < n; i++) {
         int area = height[i] * (nse[i] - pse[i] - 1);
         max = Math.max(max, area);
         System.out.println(area);
         System.out.println(max);
      }
      return -1;
   }

   public static void main(String[] args) {
      int[] height = { 2, 1, 5, 6, 2, 3 };
      

   }
}
