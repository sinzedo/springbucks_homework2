package springbucks.service;

import org.springframework.stereotype.Service;
import springbucks.data.Order;

@Service
public class OrderServiceImpl implements OrderService {

    @Override
    public Order createOrder(Order order) {
        return order;
    }
}
