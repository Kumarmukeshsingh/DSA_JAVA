import java.util.HashMap;
import java.util.Map;

public class main {

   public static void main(String[] args) {
      Map<String, Integer> mp = new HashMap<>();
      mp.put("ram", 12);
      mp.put("ram1", 13);
      mp.put("ram2", 14);
      System.out.println(mp.get("ram1"));

   }

}
