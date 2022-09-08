package springbucks.service;

import springbucks.common.Resp;
import springbucks.data.Order;

public interface OrderService {

    /**
     * 创建订单
     * @param order
     * @return
     */
    Resp createOrder(Order order);
}
