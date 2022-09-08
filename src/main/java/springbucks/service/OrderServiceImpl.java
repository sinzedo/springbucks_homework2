package springbucks.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springbucks.common.Resp;
import springbucks.data.Order;
import springbucks.mapper.OrderMapper;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderMapper orderMapper;

    @Override
    public Resp createOrder(Order order) {
        try {
            orderMapper.createOrder(order);
        }
        catch(Exception e) {
            return Resp.Fail(null);
        }

        return Resp.Success(null);
    }
}
