public class LinkedList_implemention {
   public static class Node {
      int val;
      Node next;

      Node(int val) {
         this.val = val;
      }
   }

   Node head = null;
   Node tail = null;
   int size = 0;

   public void add(int x) {
      Node temp = new Node(x);
      if (size == 0) {
         head = tail = temp;
      } else {
         tail.next = temp;
         tail = temp;
      }
      size++;
   }

   public void display() {
      if (size == 0) {
         System.out.println("queue is empty ");
         return;
      }
      Node temp = head;
      while (temp != null) {
         System.out.println(temp.val + " ");
         temp = temp.next;
      }
      System.out.println();
   }

   public int peek() {
      if (size == 0) {
         System.out.println("queue is empty ");
         return -1;
      }
      return head.val;

   }

   public int remove() {
      if (size == 0) {
         System.out.println("queue is empty ");
         return -1;
      }
      int x = head.val;
      head = head.next;
      size--;
      return x;
   }

   public static void main(String[] args) {
      LinkedList_implemention qL = new LinkedList_implemention();
      qL.add(0);
      qL.add(1);
      qL.add(4);
      qL.add(5);
      qL.display();// 0,1,4,5
      qL.remove();
      qL.display();// 1,4,5
      System.out.println(qL.peek());// 1
   }
}
