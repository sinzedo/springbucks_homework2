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
    Resp createCoffee(Coffee coffee);

    /**
     * 获取咖啡
     * @param id
     * @return
     */
    Resp getCoffee(String id);

    /**
     * 更新咖啡信息
     * @param id
     * @param coffee
     * @return
     */
    Resp updateCoffee(Long id,Coffee coffee);

    /**
     * 设置咖啡名称
     * @param name
     * @return
     */
    Resp setCoffeeName(Long id,String name);

    /**
     * 删除咖啡
     * @param id
     * @return
     */
    Resp deleteCoffee(Long id);
}
