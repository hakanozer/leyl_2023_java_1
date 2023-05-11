package useStreamParalelStream;

import java.util.List;

public class MainStreamParalel {
    public static void main(String[] args) {

        CustomerResult customerResult = new CustomerResult();
        List<Customer> ls = customerResult.result(500);

        long start = System.currentTimeMillis();
        ls
        .parallelStream()
        .filter(item -> item.getCid() > 10)
        .forEach(item -> {
            try {
                Thread.sleep(200);
                System.out.println("Title :" + item.getName() );
            }catch (Exception ex) {}
        });
        long end = System.currentTimeMillis();
        long between = end - start;
        System.out.println("between : " +  between);

    }
}
