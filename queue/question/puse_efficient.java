import java.util.Stack;

class puse_efficient {
   Stack<Integer> st = new Stack<>();
   Stack<Integer> helper = new Stack<>();

   public void push(int x) {
      st.push(x);
   }

   public int pop() {
      while (st.size() > 1) {
         helper.push(st.pop());
      }

      int x = st.pop();
      while (helper.size() > 0) {
         st.push(st.pop());
      }
      return x;
   }

   public int peek() {
      while (st.size() > 1) {
         helper.push(st.pop());
      }

      int x = st.peek();
      while (helper.size() > 0) {
         st.push(st.pop());
      }
      return x;

   }

   public boolean isEmpty() {
      if (st.size() == 0) {
         return true;
      } else {
         return false;
      }
   }

}