import java.util.LinkedList;

public class implemention {
   public class Node {
      int data;
      Node next;

      Node(int data) {
         this.data = data;
         this.next = null;
      }
   }

   public Node head = null;
   public Node tail = null;

   public void InsertAtEnd(int data) {
      Node temp = new Node(data);
      if (head == null) {
         head = temp;
         tail = temp;
      } else {
         tail.next = temp;
      }
      tail = temp;
   }

   public void InsertAtStart(int data) {
      Node newNode = new Node(data);
      if (head == null) {
         head = tail = newNode;
      } else {
         newNode.next = head;
         head = newNode;
      }
   }

   public int size() {
      Node temp = head;
      int count = 0;
      while (temp != null) {
         count++;
         temp = temp.next;
      }
      return count;
   }

   public void insertAt(int idx, int data) {
      Node t = new Node(data);
      Node temp = head;
      if (idx == size()) {
         InsertAtEnd(data);
         return;
      } else if (idx == 0) {
         InsertAtStart(data);
         return;
      } else if (idx < 0 || idx > size()) {
         System.out.println(" wrong");
      }
      for (int i = 1; i <= idx - 1; i++) {
         temp = temp.next;
      }
      t.next = temp.next;
      temp.next = t;
   }

   public void display() {
      Node temp = head;
      if (temp == null) {
         System.out.println("empty linkedlist ");
      }
      while (temp != null) {
         System.out.print(temp.data + " ");
         temp = temp.next;
      }
   }

   public int getAt(int idx) {
      if (idx < 0 || idx > size()) {
         System.out.println("wrong ");
         return -1;
      }
      Node temp = head;
      for (int i = 1; i <= idx; i++) {
         temp = temp.next;
      }
      return temp.data;
   }

   public void deleteAt(int idx) {
      if (idx == 0) {
         head = head.next;
         // size--;
         return;
      }
      Node temp = head;
      for (int i = 1; i <= idx - 1; i++) {
         temp = temp.next;

         temp.next = temp.next.next;
         tail = temp;
         // size--;
      }
      // System.out.println();
   }

   public static void main(String[] args) {
      implemention LL = new implemention();
      LL.InsertAtEnd(1);
      LL.InsertAtEnd(2);
      LL.InsertAtEnd(3);
      LL.InsertAtStart(4);
      LL.InsertAtStart(5);
      LL.insertAt(2, 10);
      LL.deleteAt(2);

      LL.display();

   }

}
