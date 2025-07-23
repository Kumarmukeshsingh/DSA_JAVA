abstract class Animal {
   abstract void sound();

   int x = 10;

   public void sleep() {
      System.out.println(" Zzzzzzzzzz.......");
   }
}

class Dog extends Animal {
   void sound() {
      System.out.println(" bho....... bho.....");
   }
}

public class Main {
   public static void main(String[] args) {
      Animal obj = new Dog();
      obj.sound();
      System.out.println(obj.x);
   }

}
