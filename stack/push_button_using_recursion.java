import java.util.Stack;

public class push_button_using_recursion {
   public static void main(String[] args) {
      Stack<Integer> st = new Stack<>();
      st.push(1);
      st.push(3);
      st.push(4);
      st.push(5);
      st.push(6);
      pushbuttom(st, 10);
   }

   public static void pushbuttom(Stack<Integer> st, int x) {
      if (st.size() == 0) {
         st.push(x);
         return;
      }

      int top = st.pop();
      System.out.print(top + " ");
      pushbuttom(st, x);
      st.push(top);
   }

}