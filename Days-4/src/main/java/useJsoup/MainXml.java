package useJsoup;

import props.Currency;

import java.util.List;

public class MainXml {
    public static void main(String[] args) {

        XmlResult xmlResult = new XmlResult();
        List<Currency> ls = xmlResult.xml();
        System.out.println( ls.get(1) );

    }
}
