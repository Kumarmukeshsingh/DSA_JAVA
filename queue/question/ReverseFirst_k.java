
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirst_k {
   public static void main(String[] args) {

      Queue<Integer> q = new LinkedList<>();
      q.add(1);
      q.add(2);
      q.add(3);
      q.add(4);
      q.add(5);
      q.add(6);
      System.out.println(q);
      Stack<Integer> st = new Stack<>();
      int n = q.size();
      int k = 3;

      while (q.size() > k) {
         st.push(q.remove());
      }

      while (st.size() > 0) {
         q.add(st.pop());
      }

      for (int i = 1; i <= n - k; i++) {
         q.add(q.remove());
      }

      System.out.println(q);
      System.out.println(st);

   }
}
