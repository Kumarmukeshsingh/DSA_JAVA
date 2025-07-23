import java.util.Arrays;
import java.util.Scanner;

public class Array {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int no, temp;

      System.out.println("enter  no of elements you want in array");
      no = in.nextInt();
      int ar[] = new int[no];
      System.out.println("Enter" + no + " elements");
      for (int i = 0; i < no; i++)
         ar[i] = in.nextInt();
      System.out.println("Before sorting");
      System.out.println(Arrays.toString(ar));
      // sorting the array element
      for (int i = 0; i < no; i++) {
         for (int j = i + i; j < no; j++) {
            // swap the elemtnt if ar[i]>arr[j5]
            if (ar[i] > ar[j]) {
               temp = ar[i];
               ar[i] = ar[j];
               ar[j] = temp;
            }
         }
      }

      System.out.println("After sorting");
      System.out.println(Arrays.toString(ar));
   }

}
