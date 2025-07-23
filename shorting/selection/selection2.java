
public class selection2 {

   static void selectionSort(int[] arr) {
      int n = arr.length;
      for (int i = 0; i < n - 1; i++) {// i represent the current index
         // find the minimum element in unsorted array
         int min_Index = i;
         for (int j = i + 1; j < n; j++) {
            if (arr[j] < arr[min_Index]) {
               min_Index = j;
            }
         }
         // swap currnt element and minimum element - currnt index i wii hava a correct
         // element
         // a[min-index], arr[i]
         int temp = arr[i];
         arr[i] = arr[min_Index];
         arr[min_Index] = temp;

      }
   }

   public static void main(String[] args) {

      int[] arr = { 7, 4, 5, 1, 2 };
      for (int i = 0; i < arr.length; i++) {
         System.out.print(arr[i] + "  ");
      }
      selectionSort(arr);
      System.out.println( );
      for (int i = 0; i < arr.length; i++) {
         System.out.print(arr[i] + "  ");
      }
   }
}
