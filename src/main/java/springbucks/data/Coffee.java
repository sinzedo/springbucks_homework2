package springbucks.data;

import lombok.Data;
import org.joda.money.Money;

@Data
public class Coffee extends DataBase {

    private String name;

    private Money price;
}
