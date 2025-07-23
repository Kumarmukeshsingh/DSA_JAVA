import java.util.Scanner;

// input mukesh 
// output MUKESH

public class toggleChar {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      // StringBuilder str = new StringBuilder(sc.nextLine());
      StringBuilder str = new StringBuilder("mukesh");
      // System.out.println(str);

      // togle
      for (int i = 0; i < str.length(); i++) {
         // check alpabet small or capaital
         boolean flag = true; // if capital
         char ch = str.charAt(i);
         // System.out.println(ch);
         int ascii = (int) ch;
         // System.out.println(ascii);

         if (ascii >= 97)
            flag = false;// small

         if (flag == true) {// capital 97 => 122
            ascii += 32;
            char dh = (char) ascii;
            str.setCharAt(i, dh);
         } else {// small 65 = 90
            ascii -= 32;
            char dh = (char) ascii;
            str.setCharAt(i, dh);

         }
      }
      System.out.println(str);
   }
}
