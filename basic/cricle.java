import java.util.Scanner;

public class cricle {
   public static void main(String[] args)

   {
      Scanner in = new Scanner(System.in);
      float area, r;
      System.out.println("enter the radius of circle");
      r = in.nextFloat();
      area = 3.14f * r * r;
      System.out.println("area of circle=" + area);

   }

}

// {
// scanner in =new Scanner(System.in);
// float area,radius;
// system.out.println("enter the radius");
// r=in.nextFloat();
// area=3.14f*radius*radius;
// system.out.println("the area of radius is ="+area);
// }