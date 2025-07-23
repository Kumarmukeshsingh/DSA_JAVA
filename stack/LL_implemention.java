
public class LL_implemention {

   public static class LLStack {// user defind data structure
      public class Node {
         int val;
         Node next;

         Node(int val) {
            this.val = val;
         }
      }

      Node head = null;
      int size = 0;

      void push(int x) {
         Node temp = new Node(x);
         temp.next = head;
         head = temp;
         size++;
      }

      int pop() {
         if (head == null) {
            System.out.println("stack is empty");
            return -1;
         }
         int x = head.val;
         head = head.next;
         return x;
      }

      int peek() {
         if (head == null) {
            System.out.println("stack is empty");
            return -1;
         }
         return head.val;
      }

      boolean isEmpty() {
         if (size == 0)
            return true;
         else
            return false;
      }

      void display() {
         Node temp = head;
         while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
         }
         System.out.println();
      }

   }

   public static void main(String[] args) {
      LLStack st = new LLStack();
      st.push(0);
      st.push(1);
      st.push(2);
      st.push(3);
      st.display();
      System.out.println(st.peek());
      st.pop();
      st.display();

   }
}