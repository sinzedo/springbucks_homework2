package springbucks.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springbucks.common.Resp;
import springbucks.data.Coffee;
import springbucks.service.CoffeeService;

@Slf4j
@RestController
@RequestMapping(value = "/coffee")
public class CoffeeController {

    @Autowired
    private CoffeeService coffeeService;

    /**
     * 题目2 实现返回json报文
     * @param coffee
     * @return
     */
    @PostMapping(value = "/createCoffee",produces = "application/json;charset=UTF-8")
    public Resp createCoffee(@RequestBody Coffee coffee) {

        log.info("createCoffee:start");

        Resp resp = coffeeService.createCoffee(coffee);

        log.info("createCoffee:done");

        return resp;
    }

    /**
     * 题目3 实现多种访问方式
     * @param id
     * @return
     */
    @GetMapping(value = "/getCoffee",produces = "application/json;charset=UTF-8")
    public Resp getCoffee(@RequestParam(value = "id") String id) {

        log.info("getCoffee:start");

        Resp resp = coffeeService.getCoffee(id);

        log.info("createCoffee:done");

        return resp;
    }

    /**
     * 题目3 实现多种访问方式
     * @param coffeeId
     * @param coffee
     * @return
     */
    @PutMapping(value = "/updateCoffee/{coffeeId}")
    public Resp updateCoffee(@PathVariable("coffeeId") Long coffeeId,@RequestBody Coffee coffee) {

        log.info("updateCoffee:start");

        Resp resp = coffeeService.updateCoffee(coffeeId,coffee);

        log.info("updateCoffee:done");

        return resp;
    }

    /**
     * 题目3 实现多种访问方式
     * @param coffeeId
     * @param coffeeName
     * @return
     */
    @PatchMapping(value = "/setCoffeeName/{coffeeId}/{coffeeName}")
    public Resp setCoffeeName(@PathVariable("coffeeId") Long coffeeId,@PathVariable("coffeeName") String coffeeName) {

        log.info("setCoffeeName:start");

        Resp resp = coffeeService.setCoffeeName(coffeeId,coffeeName);

        log.info("setCoffeeName:done");

        return resp;
    }

    /**
     * 题目3 实现多种访问方式
     * @param coffeeId
     * @return
     */
    @DeleteMapping(value = "/deleteCoffee/{coffeeId}")
    public Resp deleteCoffee(@PathVariable("coffeeId") Long coffeeId) {

        log.info("deleteCoffee:start");

        Resp resp = coffeeService.deleteCoffee(coffeeId);

        log.info("deleteCoffee:done");

        return resp;
    }
}
