
import java.util.*;

public class circulQueue {
   int front = -1;
   int rear = -1;
   int size = 0;
   int[] arr = new int[0]; // size of array

   // add element in a circual queue
   public void add(int val) throws Exception {
      if (size == arr.length) {
         // System.out.print("queue is full");
         throw new Exception("queue is full ");
      } else if (size == 0) {
         front = rear = 0;
         arr[0] = val;

      } else if (rear < arr.length - 1) {
         arr[++rear] = val;
      } else if (rear == arr.length - 1) {

         rear = 0;
         arr[0] = val;
      }
      size++;

   }

   public int remove() throws Exception {
      if (size == 0) {
         throw new Exception("queue is empty ");
      } else {
         int val = arr[front];
         if (front == arr.length)
            front = 0;
         else
            front++;
         size--;
         return val;

      }

   }

   public int peek() throws Exception {
      if (size == 0) {
         throw new Exception("queue is empty ");
      } else {
         return arr[front];
      }

   }

   public void display() {
      if (size == 0) {
         System.out.println("queue is empty ");
         return;
      } else if (front <= rear) {
         for (int i = front; i <= rear; i++) {
            System.out.println(arr[i] + " ");

         }
      } else {
         for (int i = front; i < arr.length; i++) {
            System.out.println(arr[i]);
         }
         for (int i = 0; i <= rear; i++) {
            System.out.println(arr[i] + "");
         }
      }
   }

   public static void main(String[] args) {
      circulQueue CQ = new circulQueue();
      CQ.display();
      CQ.add(10);
      CQ.add(11);
      CQ.add(12);
      CQ.display();

      CQ.remove();

      CQ.display();
   }

}
