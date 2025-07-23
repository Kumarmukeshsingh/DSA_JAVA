import java.util.Arrays;

public class search_sorted_matrix {
   static int[] search(int[][] matrix, int target) {
      int rows = matrix.length;
      int col = matrix[0].length;// matrix is empty
      if (rows == 1) {
         return binarySearch(matrix, 0, 0, col - 1, target);
      }

      int rstart = 0;
      int rend = rows - 1;
      int cmid = col / 2;
      // run the loop till 2 row are remaning
      while (rstart < (rend - 1)) {
         int mid = rstart + (rend - rstart) / 2;
         if (matrix[mid][cmid] == target) {
            return new int[] { mid, cmid };
         }

         if (matrix[mid][cmid] < target) {
            rstart = mid;
         } else {
            rend = mid;
         }
      }

      // now we have two rows
      // check whether the target is in the cal of 2 row
      if (matrix[rstart + 1][cmid] == target) {
         return new int[] { rstart + 1, cmid };
      }
      // search in 1st half
      if (target <= matrix[rstart][cmid - 1]) {
         return binarySearch(matrix, rows, 0, cmid - 1, target);
      }
      // search in 2nd half
      if (target >= matrix[rstart][cmid + 1] && target <= matrix[rstart][col - 1]) {
         return binarySearch(matrix, rstart, cmid + 1, col - 1, target);
      }
      // search in 3rd half
      if (target <= matrix[rstart + 1][cmid - 1]) {
         return binarySearch(matrix, rstart + 1, 0, cmid - 1, target);
      } else {
         return binarySearch(matrix, rstart + 1, cmid + 1, col - 1, target);
      }

   }

   // search in the row provided between the col provided
   static int[] binarySearch(int[][] matrix, int row, int Cstart, int Cend, int target) {
      while (Cstart <= Cend) {
         int mid = Cstart + (Cend - Cstart) / 2;
         if (matrix[row][mid] == target) {
            return new int[] { row, mid };
         }
         if (matrix[row][mid] < target) {
            Cstart = mid + 1;

         } else {
            Cend = mid - 1;
         }
      }
      return new int[] { -1, -1 };
   }

   public static void main(String[] args) {
      int[][] arr = { { 10, 20, 30, 40 },
            { 15, 25, 35, 45 },
            { 28, 29, 37, 49 },
            { 33, 34, 38, 50 }
      };
      System.out.println(Arrays.toString(search(arr, 50)));
   }
}
