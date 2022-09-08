package springbucks.data;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import org.hibernate.annotations.Type;
import org.joda.money.Money;
import springbucks.common.MoneySerializer;

import java.io.Serializable;

@Data
public class Order {

    @Type(type = "org.jadira.usertype.moneyandcurrency.joda.PersistentMoneyMinorAmount",
            parameters = {@org.hibernate.annotations.Parameter(name = "currencyCode", value = "CNY")})
    @JsonSerialize(using = MoneySerializer.class)
    private Money price;

    private Coffee coffee;
}
