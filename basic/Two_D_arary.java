import java.util.Scanner;

public class Two_D_arary {
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      System.out.println("enter the number of row : ");
      int row = sc.nextInt();
      System.out.println("enter the number of colum : ");
      int col = sc.nextInt();

      int[][] number = new int[row][col];
      for (int i = 0; i < row; i++) {
         for (int j = 0; j < col; j++) {
            number[i][j] = sc.nextInt();
         }
      }
      // output statment
      for (int i = 0; i < row; i++) {
         for (int j = 0; j < col; j++) {
            System.out.print(number[i][j] + " ");
         }
         System.out.println();
      }
   }

}
