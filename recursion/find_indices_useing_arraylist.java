import java.util.ArrayList;

public class find_indices_useing_arraylist {
   public static void main(String[] args) {
      int[] arr = { 1, 2, 3, 2, 2, 5, 6, 4 };
      int target = 2;
      int n = arr.length;
      ArrayList<Integer> ans = index(arr, n, target, 0);
      for (Integer i : ans) {
         System.out.println(i);
      }
   }

   static ArrayList<Integer> index(int[] arr, int n, int target, int idx) {
      // base case
      if (idx >= n) {
         return new ArrayList<Integer>();
      }

      ArrayList<Integer> ans = new ArrayList<>();
      // self work
      if (arr[idx] == target) {
         ans.add(idx);
      }
      // recursive work;
      ArrayList<Integer> smallans = index(arr, n, target, idx + 1);

      ans.addAll(smallans);
return ans;
   }
}
