public class Array_implemention {
   public static void main(String[] args) {
      stack st = new stack();
      st.push(0);
      st.push(2);
      st.push(3);

      // st.display();
      System.out.println(st.peek());//3
      st.pop();// 3
      st.display();//o 2
      System.out.println(st.size()); //2

   }

   public static class stack {
      private int[] arr = new int[5];
      private int idx = 0;

      void display() {
         for (int i = 0; i < idx; i++) {
            System.out.println(arr[i] + " ");
         }
      }

      int size() {
         return idx;
      }

      boolean isEmpty() {
         if (idx == 0) {
            return true;
         } else {
            return false;
         }
      }

      boolean isFull() {
         if (idx == arr.length)
            return true;
         else
            return false;
      }

      int capacity() {
         return arr.length;
      }

      void push(int x) {
         if (isFull()) {
            System.out.println("stack is full");
            return;
         }
         arr[idx] = x;
         idx++;
      }

      int peek() {
         if (idx == 0) {
            System.out.println("stack is empty");
            return -1;
         }
         return arr[idx - 1];
      }

      int pop() {
         if (idx == 0) {
            System.out.println("stack is empty");
            return -1;
         }
         int top = arr[idx - 1];
         arr[idx - 1] = 0;
         idx--;
         return top;
      }

   }
}
