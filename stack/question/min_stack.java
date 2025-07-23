
import java.util.Stack;

public class min_stack {
   Stack<Integer> st = new Stack<>();
   Stack<Integer> min = new Stack<>();

   public static void push(int val) {
      if (st.size == 0) {
         st.push(val);
         min.push(val);
      } else {
         st.push(val);
         if (min.peek() < val) {
            min.push(min.peek());
         } else {
            min.push(val);
         }
      }

   }

   public void pop() {
      st.pop();
      min.pop();
   }

   public int top() {
      return st.peek();
   }

   public int getmin() {
      return min.peek();
   }

   public static void main(String[] args) {
      min_stack st = new min_stack();
      st.push(0);
      st.push(2);
      st.push(3);
      System.out.println(st);
   }

}
