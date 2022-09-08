package springbucks.service;

import org.springframework.stereotype.Service;
import springbucks.common.Resp;
import springbucks.data.Coffee;


public interface CoffeeService {

    /**
     * 创建咖啡
     * @param coffee
     * @return
     */
    Coffee createCoffee(Coffee coffee);
}
