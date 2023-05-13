package useRetrofit.props;

import lombok.Data;

import java.util.List;

@Data
public class DummyProduct {
    private List<Product> products;
    private Long total;
    private Long skip;
    private Long limit;
}
