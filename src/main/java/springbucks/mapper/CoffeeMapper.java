package springbucks.mapper;

import org.apache.ibatis.annotations.*;
import springbucks.data.Coffee;

@Mapper
public interface CoffeeMapper {

    @Insert("insert into t_coffee(id,name,price,create_time) " +
            "values(#{id},#{name},#{price),now()")
    int createCoffee(Coffee coffee);

    @Update("update t_coffee set " +
            "name = #{name}," +
            "update_time = now() " +
            "where id = #{id}")
    int setCoffeeName(@Param("id") Long id,@Param("name") String name);

    @Update("update t_coffee set " +
            "name = #{name}," +
            "price = #{price}," +
            "udpate_time = now() " +
            "where id = #{id}")
    int updateCoffee(Coffee coffee);

    @Delete("delete from t_coffee where id = #{id}")
    int deleteCoffee(@Param("id") Long id);

    @Select("select * from t_coffee where id = #{id}")
    Coffee getCoffee(@Param("id") String id);
}
