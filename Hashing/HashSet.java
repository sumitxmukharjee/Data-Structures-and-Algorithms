// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Set;
import java.util.HashSet;
public class HashSets {
  public static void main(String[] args) {

    Set<String> names = new HashSet<String>();
    names.add("Walter");
    names.add("Sumit");
    names.add("Mike");
    names.add("Mike");

    // names.remove("Walter");
    // System.out.println(names.size());
    // System.out.println(names.contains("Sumit"));

    // System.out.println(names.isEmpty());

    // names.clear();
    // System.out.println(names);

    for(String name : names){
      System.out.println(name);
    }
    
    // System.out.println("Hello world!");
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}