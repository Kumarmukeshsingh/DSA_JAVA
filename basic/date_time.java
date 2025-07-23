 
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class date_time {
   public static void main(String[] args) {
   
      String string = "2017-05-25";
      LocalDate date = LocalDate.parse(string, DateTimeFormatter.ISO_DATE);
      System.out.println(date);
   }
}