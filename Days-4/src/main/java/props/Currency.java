package props;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Currency {

    private String isim;
    private String forexBuying;
    private String forexSelling;

}
