public class constructor {
   int rollno;
   String name;

   public constructor(int x, String s) {
      rollno = x;
      name = s;
   }

   public static void main(String[] args) {
      constructor obj = new constructor(10, "mukesh");
      constructor obj2 = new constructor(101, "mukesh singh");

      System.out.println(obj.name + " " + obj.rollno);
      System.out.println(obj2.name + " " + obj2.rollno);
   }
}
