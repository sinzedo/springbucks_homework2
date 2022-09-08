package springbucks.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springbucks.common.Resp;
import springbucks.data.Order;
import springbucks.service.OrderService;

@Slf4j
@RestController
@RequestMapping(value = "/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    /**
     * 题目2 实现返回xml格式报文
     * @param order
     * @return
     */
    @PostMapping(value = "/createOrder",produces = "application/xml;charset=UTF-8")
    public Resp createOrder(@RequestBody Order order) {

        log.info("createOrder:start");

        Resp resp = orderService.createOrder(order);

        log.info("createOrder:done");

        return resp;
    }
}
