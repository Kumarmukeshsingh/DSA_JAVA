import java.util.*;
public class stringBulder {
   public static void main(String[] args) {
      StringBuilder str = new StringBuilder("mukesh");
      System.out.println(str);
      str.append("singh");
      // char s = 'a';
      // str.setCharAt(3, s);
      // System.out.println(str);
      String s = "radha";
      str.insert(2, s);
      // System.out.println(str);
      str.delete(0, 4);
      System.out.println(str);
      str.reverse();
      System.out.println(str);
      str.delete(2, 5);
      System.out.println(str);

   }
}
