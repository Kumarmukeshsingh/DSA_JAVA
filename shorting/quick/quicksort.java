
public class quicksort {

   public static void main(String[] args) {
      int[] arr = { 4, 1, 3, 5, 2 };
      int n = arr.length;
      display(arr);
      System.out.println();
      quickShort(arr, 0, n - 1);
      display(arr);

   }

   static void swap(int[] arr, int x, int y) {
      int temp = arr[x];
      arr[x] = arr[y];
      arr[y] = temp;
      // return temp;

   }

   static void quickShort(int arr[], int start, int end) {

      if (start >= end)
         return;

      int pi = partation(arr, start, end);
      quickShort(arr, start, pi - 1);
      quickShort(arr, pi + 1, end);
   }

   static int partation(int arr[], int start, int end) {
      int pivat = arr[start];
      int count = 0;
      for (int i = start + 1; i <= end; i++) {
         if (arr[i] <= pivat) {
            count++;
         }

      }

      int pivotIdx = start + count;
      swap(arr, start, pivotIdx);
       
      int i = start, j = end;
      while (i < pivotIdx && j > pivotIdx) {
         while (arr[i] <= pivat)
            i++;
         while (arr[j] > pivat)
            j--;

         if (i < pivotIdx && j > pivotIdx) {
            swap(arr, i, j);
            i++;
            j--;
         }

      }
      return pivotIdx;

   }

   static int partation1(int arr[], int low, int high) {
      int pivat = arr[high];
      // smaller element of indices
      int i = (low - 1);
      System.out.print(i);
      for (int j = low; j <= high - 1; j++) {
         // increment index of smaller element
         if (arr[j] < pivat) {
            i++;
            swap(arr, i, j);
         }
      }
      swap(arr, i + 1, high);
      return (i + 1);
   }

   static void display(int[] arr) {
      for (int i : arr) {
         System.out.print(i + "  ");

      }
   }
}
