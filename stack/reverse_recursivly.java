import java.util.Stack;

public class reverse_recursivly {
   public static void main(String[] args) {
      Stack<Integer> st = new Stack<>();
      st.push(1);
      st.push(3);
      st.push(4);
      st.push(5);
      st.push(6);
      System.out.println(st);
      Reverse(st);
   }

   public static void Reverse(Stack<Integer> st) {

      if (st.size() == 0)
         return;

      int top = st.pop();
      System.out.print(top + " ");
      Reverse(st);
      st.push(top);

   }

}
