public class get_byte {
   public static void main(String[] args) {
      String s = "a z";
      // String s = "A Z";
      byte ar[] = s.getBytes();
      for (int i = 0; i < ar.length; i++) {
         System.out.println(ar[i]);
      }
   }

}

// exception Handling:-
// try block:
// catch block:
// throw statement:
// finally block: