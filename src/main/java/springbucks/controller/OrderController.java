package springbucks.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springbucks.common.Resp;
import springbucks.data.Order;
import springbucks.service.OrderService;

@RestController
@RequestMapping(value = "/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping(value = "/createOrder",produces = "application/xml;charset=UTF-8")
    public Resp createOrder(@RequestBody Order order) {

        Order data = orderService.createOrder(order);

        return Resp.Success(data);
    }
}
