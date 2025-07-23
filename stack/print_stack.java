import java.util.Stack;

public class print_stack {

   public static void main(String[] args) {
      Stack<Integer> st = new Stack<>();
      st.push(1);
      st.push(3);
      st.push(4);
      st.push(5);
      st.push(6);
      System.out.println(st);

      displayRec(st);

      // int n = st.size();
      // int arr[] = new int[n];
      // for (int i = n - 1; i >= 0; i--) {
      // arr[i] = st.pop();
      // }
      // for (int j = 0; j < n; j++) {
      // System.out.println(arr[j]);
      // st.push(arr[j]);
      // }
      // // System.out.println(st);
   }

   // print stack using recursion
   static void displayRec(Stack<Integer> st) {
      if (st.size() == 0)
         return;
         int top = st.pop();
         System.out.print(top + "  ");
         displayRec(st);
      st.push(top);
   }
}