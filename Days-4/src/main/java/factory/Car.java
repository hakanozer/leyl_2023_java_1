package factory;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Car {

    private String brand;
    private String modal;
    private int power;

}
