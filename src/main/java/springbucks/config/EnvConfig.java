package springbucks.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "test")
@RefreshScope
@Data
public class EnvConfig {

    private String envid;

    private String envname;

}
