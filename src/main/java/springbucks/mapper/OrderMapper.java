package springbucks.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import springbucks.data.Order;

@Mapper
public interface OrderMapper {

    @Insert("insert into t_order(id,price,coffee_id,create_time) " +
            "values(#{id},#{price},#{coffee.id},now())")
    int createOrder(Order order);
}
