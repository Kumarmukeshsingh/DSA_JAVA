public class search_array_element {
   void searchinarray() {
      int arr[] = { 10, 29, 4, 5, 6, 7, 9 };
      int x = 7;
      int ans = -1;
      for (int i = 0; i < arr.length; i++) {
         System.out.println(arr[i]);
         if (arr[i] == x) {
            // ans = arr[i]; //it give the element of array
            ans = i;// it give only index number of the element
         }
      }
      System.out.println("find " + x + " at index :" + ans);
   }
   public static void main(String[] args) {
      search_array_element obj = new search_array_element();
      obj.searchinarray();
   }
}
