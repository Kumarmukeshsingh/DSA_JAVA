import java.util.Stack;

public class basic {

   public static void main(String[] args) {
      Stack<Integer> st = new Stack<>();
      st.push(1);
      st.push(3);
      st.push(4);
      st.push(5);
      st.push(6);
      System.out.println(st);
      System.out.println(st.size());
      st.pop();
      System.out.println(st);
      System.out.println(st.size());

   }
}