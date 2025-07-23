public class person {

   private String name;

   public String get() {
      return name;
   }

   public void set(String NewName) {
      this.name = NewName + " 1234";
   }

   public static void main(String[] args) {
      person obj = new person();
      obj.set("krishna");
      System.out.println(obj.get());
   }
}