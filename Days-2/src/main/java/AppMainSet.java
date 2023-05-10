import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class AppMainSet {
    public static void main(String[] args) {

        // Set -> Bensersiz liste elemanları için kullanılır.
        Set<String> set = new HashSet<>();
        set.add("Ali");
        set.add("Ali");
        set.add("Kemal");
        set.add("Kenan");
        set.add("Kenan");
        set.add("Zehra");
        set.add("Mehmet");
        System.out.println(set);

        System.out.println("==================");
        Set<String> set1 = new LinkedHashSet<>();
        set1.add("Ali");
        set1.add("Ali");
        set1.add("Kemal");
        set1.add("Kenan");
        set1.add("Kenan");
        set1.add("Zehra");
        set1.add("Mehmet");
        System.out.println(set1);

        set1
        .stream()
        .filter( item -> item.length() > 4 )
        .forEach(item -> {
            System.out.println( item );
        });

    }
}
