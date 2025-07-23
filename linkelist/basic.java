import java.util.LinkedList;

public class basic {
   // public static class Node {
   // int data; // value
   // int next; // address of the next node

   // Node(int data) {
   // this.data = data;
   // }
   // }

   public static void main(String[] args) {
      LinkedList<String> cars = new LinkedList<>();
      cars.add("bmw");
      cars.add("suzki");
      cars.add("aoudi");
      // System.out.println(cars);
      // cars.addFirst("scorpio");

      // System.out.println(cars);
      // cars.addLast(" track");
      // System.out.println(cars);
      // cars.removeLast();
      // System.out.println(cars);

         String getFirst=cars.getFirst();
      System.out.println(getFirst);
      String getLast = cars.getLast();
      System.out.println(getLast);
   }

}
