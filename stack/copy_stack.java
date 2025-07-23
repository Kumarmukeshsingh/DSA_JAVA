import java.util.Scanner;
import java.util.Stack;

public class copy_stack {
   public static void main2(String[] args) {
      Stack<Integer> st = new Stack<>();
      Scanner se = new Scanner(System.in);
      int n;
      System.out.println("enter the number of element: ");
      n = se.nextInt();
      System.out.println("enter the element: ");

      for (int i = 0; i < n; i++) {
         int x = se.nextInt();
         st.push(x);
      }
      System.out.println(st);
   }

   

   public static void main(String[] args) {
      Stack<Integer> st = new Stack<>();
      st.push(4);
      st.push(5);
      st.push(6);
      st.push(7);
      st.push(8);

      Stack<Integer> gt = new Stack<>();
      while (st.size() > 0) {
         gt.push(st.pop());
      }

      Stack<Integer> rt = new Stack<>();
      while (gt.size() > 0) {
         rt.push(gt.pop());
      }
      System.out.println(rt);

   }

}
