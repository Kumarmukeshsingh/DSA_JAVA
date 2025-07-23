
class LL {

   // class constructor 
   class Node {
      int data;
      Node next;

      public Node(int data) {
         this.data = data;
         this.next = null;
      }
   }

   public Node head = null;
   public Node tail = null;

   public void addAtStart(int data) {
      // create new node
      Node newNode = new Node(data);
      if (head == null) {
         head = newNode;
         tail = newNode;
      } else {
         newNode.next = head;
         head = newNode;
      }
   }

   public void insertAtEnd(int data) {
      Node newNode = new Node(data);
      if (head == null) {
         head = newNode;
         tail = newNode;
      } else {
         tail.next = newNode;
         tail = newNode;
      }
   }
 // insert any index of the linkelist
   public void insertAt(int idx, int val) {
      Node newNode = new Node(val);
      Node temp = head;
      if (idx == size()) {
         insertAtEnd(val);
         return;
      } else if (idx == 0) {
         addAtStart(val);
         return;
      } else if (idx < 0 || idx > size()) {

         System.out.println("wrong index");
      }

      for (int i = 1; i <= idx - 1; i++) {
         temp = temp.next;
      }
      newNode.next = temp.next;
      temp.next = newNode;

   }

   public int getAt(int idx) {
      if (idx < 0 || idx > size()) {
         System.out.println("wrong index2");
         return -1;
      }
      Node temp = head;
      for (int i = 1; i <= idx; i++) {
         temp = temp.next;
      }
      return temp.data;
   }

   public void deleteAt(int idx) {
      Node temp = head;
      for (int i = 1; i < idx - 1; i++) {
         temp = temp.next;// reach the target element
      }
      temp.next = temp.next.next;
      tail = temp;
      // size--; // when the initallized size=0;
   }

   void display() {
      Node current = head;
      if (head == null) {
         System.out.println("List is empty");
         return;
      }
      System.out.println("adding new node in the start node ");
      while (current != null) {
         System.out.print(current.data + " ");
         current = current.next;

      }
      System.out.println();
   }

   int size() {
      Node temp = head;
      int count = 0;
      while (temp != null) {
         count++;
         temp = temp.next;

      }
      return count;
   }



   public static void main(String[] args) {
      LL linked = new LL();
      linked.addAtStart(2);
      linked.display();

      linked.addAtStart(3);
      linked.display();

      linked.addAtStart(5);
      linked.display();

      linked.insertAtEnd(6);
      linked.display();

      linked.insertAt(2, 7);
      linked.display();
      System.out.println(" get at any index ");
      System.out.println(linked.getAt(1));
      System.out.println(linked.size());
      linked.deleteAt(1);
      linked.display();
      System.out.println(linked.size());

   }
}