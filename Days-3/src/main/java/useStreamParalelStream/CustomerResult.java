package useStreamParalelStream;

import java.util.ArrayList;
import java.util.List;

public class CustomerResult {

    public List<Customer> result( int count ) {
        List<Customer> ls = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            Customer c  = new Customer();
            c.setCid(i);
            c.setName("Ali - " + i);
            ls.add(c);
        }
       return ls;
    }

}
