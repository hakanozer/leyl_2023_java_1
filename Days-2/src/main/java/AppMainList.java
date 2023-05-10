import java.util.ArrayList;
import java.util.List;

public class AppMainList {
    public static void main(String[] args) {

        // Array -> unMutabla
        // Collection -> mutable

        // Normal Array
        String[] arr = { "İstanbul", "İzmir", "Ankara", "Bursa" };
        System.out.println(arr);

        // ArrayList
        ArrayList<String> lsx = new ArrayList<>();
        List<String> ls = new ArrayList<>();

        // item add
        ls.add("İstanbul");
        ls.add("İzmir");
        ls.add("Ankara");
        ls.add("Bursa");

        // index add
        ls.add(1, "Hatay");

        // single data
        int index = 4;
        if ( ls.size() > index ) {
            System.out.println( ls.get(index) );
        }

        // all item
        for (int i = 0; i < ls.size(); i++) {
            System.out.println( ls.get(i) );
        }
        System.out.println("================");
        int number = 10;
        ls.forEach( item -> {
            System.out.println( "Number : " + number + " " + item );
        });

        // ls.clear();
        boolean conStatus = ls.contains("İstanbul");
        int indexStatus = ls.indexOf("ankara");
        System.out.println("conStatus : " + conStatus);
        System.out.println("indexStatus : " + indexStatus);

        // remove
        ls.remove("Hatay");
        ls.remove(0);


        System.out.println(ls);

    }
}
