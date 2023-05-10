import props.Product;

import java.util.ArrayList;
import java.util.List;

public class AppMainListProps {
    public static void main(String[] args) {

        List<Product> ls = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Product p1 = new Product();
            p1.setPid(100+i);
            p1.setTitle("TV - " + i);
            p1.setDetail("TV Detay - " + i);
            p1.setPrice(20000+i);
            ls.add(p1);
        }

        for( Product item : ls ) {
            System.out.println( item.getPid() + " " + item.getTitle() );
        }
        System.out.println("====================");
        for ( Product item : ls ) {
            if ( item.getPrice() > 20001 && item.getPrice() < 20010 ) {
                System.out.println( item.getPid() + " " + item.getTitle() );
            }
        }
        System.out.println("====================");
        ls
        .stream()
        .filter(
            item -> item.getPrice() > 20001 && item.getPrice() < 20010
        )
        .filter(
            item -> item.getTitle().contains("TV -")
        ).forEach( item -> {
            System.out.println( item.getPid() + " " + item.getTitle() );
        });
        //System.out.println( ls );

    }
}
