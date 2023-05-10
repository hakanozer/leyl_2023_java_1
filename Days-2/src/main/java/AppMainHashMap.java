import props.Address;
import utils.EMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AppMainHashMap {
    public static void main(String[] args) {

        // Key, Val
        Map<String, Object> hm = new HashMap<>();

        // Add item
        Address address = new Address();
        address.setCity("İstanbul");
        address.setTitle("İş yeri Adresi");

        hm.put("name", "Ali");
        hm.put("name", "Erkan");
        hm.put("surname", "Bilsin");
        hm.put("age", 22 );
        hm.put("email", "erkan@mail.com" );
        hm.put("status", true );
        hm.put("address", address);

        // single item
        System.out.println( hm.get("age") );
        System.out.println( hm.get("email") );

        // all item
        Set<String> keys = hm.keySet();
        for (String key : keys) {
            System.out.println( key + " - " + hm.get(key) );
        }
        System.out.println("=====================");
        hm.forEach( (k, v) -> {
            System.out.println( k + " - " + v );
            if( v instanceof Address ) {
                Address address1 = (Address) v;
                System.out.println( address1.getCity() + " " + address1.getTitle() );
            }
        });

        // key control
        boolean emailStatus = hm.containsKey("email");
        System.out.println("emailStatus :" + emailStatus);
        System.out.println( hm.get("isim") );

        // all item clear
        // hm.clear();

        // single item delete
        hm.remove("email");
        System.out.println( hm );

        // Enum HashMap
        Map<EMap, Object> hmx = new HashMap<>();
        hmx.put(EMap.name, "Serkan");
        hmx.put(EMap.surname, "Bilirler");
        hmx.put(EMap.email, "serkan@mail.com");
        hmx.put(EMap.age, 23);
        hmx.put(EMap.status, true);
        hmx.put(EMap.address, address);

        // Enum Single
        System.out.println( hmx.get( EMap.email ) );

        System.out.println( hmx );

    }
}
