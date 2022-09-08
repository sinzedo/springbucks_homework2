package springbucks.service;

import springbucks.common.Resp;
import springbucks.data.Order;

public interface OrderService {

    Order createOrder(Order order);
}
