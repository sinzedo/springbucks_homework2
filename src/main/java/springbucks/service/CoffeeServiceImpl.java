package springbucks.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springbucks.common.Resp;
import springbucks.data.Coffee;
import springbucks.mapper.CoffeeMapper;

@Service
public class CoffeeServiceImpl implements CoffeeService {

    @Autowired
    private CoffeeMapper coffeeMapper;
    @Override
    public Resp createCoffee(Coffee coffee) {

        try {
            coffeeMapper.createCoffee(coffee);
        }
        catch(Exception e) {
            return Resp.Fail(null);
        }

        return Resp.Success(null);
    }

    @Override
    public Resp getCoffee(String id) {
        Coffee ret = new Coffee();
        try {
            ret = coffeeMapper.getCoffee(id);
        }
        catch(Exception e) {
            return Resp.Fail(ret);
        }
        return Resp.Success(ret);
    }

    @Override
    public Resp updateCoffee(Long id,Coffee coffee) {
        try {
            coffee.setId(id);
            coffeeMapper.updateCoffee(coffee);
        }
        catch(Exception e) {
            return Resp.Fail(null);
        }
        return Resp.Success(null);
    }

    @Override
    public Resp setCoffeeName(Long id,String name) {

        try {
            coffeeMapper.setCoffeeName(id,name);
        }
        catch(Exception e) {
            return Resp.Fail(null);
        }
        return Resp.Success(null);
    }

    @Override
    public Resp deleteCoffee(Long id) {

        try {
            coffeeMapper.deleteCoffee(id);
        }
        catch(Exception e) {
            return Resp.Fail(null);
        }
        return Resp.Success(null);
    }
}
