
import java.util.LinkedList;
import java.util.Queue;

public class Basic {
   public static void main(String[] args) {
      Queue<Integer> q = new LinkedList<>();
      q.add(1);
      q.add(2);
      q.add(3);
      q.add(4);
      // System.out.println(q);
      // q.remove();
      // System.out.println(q);

      Queue<Integer> helper = new LinkedList<>();
      while (q.size() > 0) {
         System.out.println(q.peek());
         helper.add(q.poll());
      }

      while (helper.size() > 0) {
         q.add(helper.poll());
      }
      System.out.println(" q : " + q);
      System.out.println(" helper : " + helper);

   }
}
