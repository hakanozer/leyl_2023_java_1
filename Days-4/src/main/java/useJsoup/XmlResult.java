package useJsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import props.Currency;

import java.util.ArrayList;
import java.util.List;

public class XmlResult {

    public List<Currency> xml() {
        List<Currency> ls = new ArrayList<>();
        String url = "https://www.tcmb.gov.tr/kurlar/today.xml";
        try {
            String stData = Jsoup.connect(url).timeout(15000).ignoreContentType(true).get().toString();
            Document doc = Jsoup.parse(stData, Parser.xmlParser());
            Elements elements = doc.getElementsByTag("Currency");
            for(Element item : elements) {
                String isim = item.getElementsByTag("Isim").text();
                String forexBuying = item.getElementsByTag("ForexBuying").text();
                String forexSelling = item.getElementsByTag("ForexSelling").text();
                Currency currency = new Currency(isim, forexBuying, forexSelling);
                ls.add(currency);
            }
        }catch (Exception ex) {
            System.err.println("xml Error :" + ex);
        }
        return ls;
    }

}
