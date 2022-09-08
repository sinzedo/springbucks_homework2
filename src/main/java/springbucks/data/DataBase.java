package springbucks.data;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.Date;

@Data
public class DataBase implements Serializable {

    @Id
    private Long id;

    private Date create_time;

    private Date update_time;
}
