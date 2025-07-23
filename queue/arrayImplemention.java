import java.util.Arrays;

public class arrayImplemention {

   int f = -1;
   int r = -1;
   int size = 0;
   int[] arr = new int[100];

   public void add(int val) {
      if (r == arr.length - 1) {
         System.out.println("queue is full ");
         return;
      }
      if (f == -1) {
         f = r = 0;
         arr[0] = val;
      } else {
         arr[++r] = val;
      }
      size++;
   }

   public void display() {
      if (size == 0) {
         System.out.println("queue is empty ");
      } else {
         for (int i = f; i <= r; i++) {
            System.out.println(arr[i] + " ");
         }
      }

   }

   public int remove() {
      if (size == 0) {
         System.out.println("queue is empty  ");
         return -1;
      }
      f++;
      size--;
      return arr[f - 1];
   }

   public int peek() {
      if (size == 0) {
         System.out.println("queue is empty ");
         return -1;
      }
      return arr[f];

   }

   public static void main(String[] args) {

      arrayImplemention q = new arrayImplemention();

      q.add(1);
      q.add(2);
      q.add(3);
      q.add(6);
      // q.display();// 1,2,3,6
      // q.remove();
      // q.display();// 2,3,6
      // System.out.println(q.peek());//1
      q.display();

   }

}
