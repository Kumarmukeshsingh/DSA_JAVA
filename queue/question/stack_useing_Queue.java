import java.util.LinkedList;
import java.util.Queue;

public class stack_useing_Queue {
   Queue<Integer> q = new LinkedList<>();

   public void push(int x) {
      q.add(x);

   }

   public int pop() {
      for (int i = 1; i <= q.size() - 1; i++) {
         q.add(q.remove());
      }

      int val = q.peek();
      q.remove();
      return val;

   }

   public int top() {// peek
      for (int i = 1; i <= q.size() - 1; i++) {
         q.add(q.remove());
      }
      int val = q.peek();
      q.add(q.remove());
      return val;

   }

   public void display() {

   }

   public static void main(String[] args) {
      stack_useing_Queue st = new stack_useing_Queue();
      st.push(1);
      st.push(2);
      st.push(3);
      st.push(4);
      System.out.println(st);

      st.pop();
      System.out.println(st);
   }

}
