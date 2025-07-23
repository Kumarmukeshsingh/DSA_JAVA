import java.util.Scanner;

public class largest_value_three {
   public static void main(String[] args) {
      // double n1 = 2, n2 = 3, n3 = 5.3;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter first number");
      int n1=sc.nextInt();

      
      System.out.println("enter first number");
      int n2=sc.nextInt();

      
      System.out.println("enter first number");
       int n3=sc.nextInt();

      if (n1 >= n2 && n1 >= n3)
         System.out.println(n1 + "is lagest number.");
      else if (n2 >= n1 && n2 > +n3)
         System.out.println(n2 + "is a gratere number");
      else
         System.out.println(n3 + "is a grater number");
   }

}
