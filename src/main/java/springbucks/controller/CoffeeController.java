package springbucks.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springbucks.common.Resp;
import springbucks.data.Coffee;
import springbucks.service.CoffeeService;

@RestController
@RequestMapping(value = "/coffee")
public class CoffeeController {

    @Autowired
    private CoffeeService coffeeService;

    @PostMapping(value = "/createCoffee",produces = "application/json;charset=UTF-8")
    public Resp createCoffee(@RequestBody Coffee coffee) {

        Coffee data = coffeeService.createCoffee(coffee);



        return Resp.Success(data);
    }
}
