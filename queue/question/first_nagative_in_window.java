
// first nagative in each window of size k using extra space queue .
// gfg

import java.util.Queue;
import java.util.LinkedList;

public class first_nagative_in_window {

   public long[] printfirstNagativeInteger(long[] A, int N, int K) {
      long[] res = new long[N - K + 1];
      Queue<Integer> q = new LinkedList<>();
      for (int i = 0; i < N; i++) {
         if (A[i] < 0) {
            q.add(i);
         }
      }
      for (int i = 0; i < N - K + 1; i++) {
         if (q.size() > 0 && q.peek() < i)
            q.remove();
         if (q.size() > 0 && q.peek() <= i + K - 1) {
            res[i] = A[q.peek()];
         } else if (q.size() == 0)
            res[i] = 0;
         else
            res[i] = 0;
      }
      return res;
   }

}