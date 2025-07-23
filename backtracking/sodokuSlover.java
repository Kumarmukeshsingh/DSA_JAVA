public class sodokuSlover {
   public static int check = 0;

   public static boolean isValid(char[][] board, int row, int col, char num) {
      // check row
      for (int i = 0; i < board.length; i++) {
         if (board[row][i] == num) {
            return false;
         }
      }
      // check col // check row
      for (int i = 0; i < board.length; i++) {
         if (board[i][col] == num) {
            return false;
         }
      }
      // check 3x3 grid
      int sRow = row / 3 * 3;
      int sCol = col / 3 * 3;
      for (int i = sRow; i < sRow + 3; i++) {
         for (int j = sCol; j < sCol + 3; j++) {
            if (board[i][j] == num) {
               return false;
            }
         }
      }
      return true;
   }

   public static void solver(char[][] board, int row, int cal) {
      if (check == 9) {
         check = 1;
         return;
      }

      if (board[row][cal] != '.') {
         if (cal != 8) {
            solver(board, row, cal + 1);// recursion
         } else {
            solver(board, row + 1, cal);// recursion
         }
      } else {// board[row][col]=="."
         for (char ch = '1'; ch <= '9'; ch++) {
            if (isValid(board, row, cal, ch)) {
               board[row][cal] = ch;
            }
            if (cal != 8) {
               solver(board, row, cal + 1);// recursion
            } else {
               solver(board, row + 1, cal);// recursion
            }
            if (check == 1)
               return;
            board[row][cal] = '.';// backtrack
         }

      }

   }

   public static void sloveSodoku(char[][] board) {
      solver(board, 0, 0);
      check = 0;
   }

   public static void main(String[] args) {

   }
}
