import java.util.Scanner;

public class palindrome {
   public static void main(String[] args) {
      int reversedNum = 0;
      int remainder;
      
      Scanner in = new Scanner(System.in);
      System.out.println("enter any number number");
      int num = in.nextInt();// 121
      int orignalNum = num;

      while (num != 0) {
         remainder = num % 10;
         reversedNum = reversedNum * 10 + remainder;
         num /= 10;
      }

      if (orignalNum == reversedNum) {
         System.out.println(orignalNum + "  is palindrome");
      } else {
         System.out.println(orignalNum + "  is not palindrome.");
      }
   }

}
