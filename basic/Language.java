
abstract class Language {
   public void display() {
      System.out.println("this is java program..");
   }
}

class Main extends Language {
   public static void main(String[] args) {
      Main obj = new Main();
      obj.display();
   }
}