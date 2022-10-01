package springbucks.config;

import com.ctrip.framework.apollo.model.ConfigChangeEvent;
import org.springframework.cloud.context.scope.refresh.RefreshScope;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class ConfigListener {

    @Resource
    private EnvConfig envConfig;

    @Resource
    private RefreshScope refreshScope;

    public void onChange(ConfigChangeEvent event) {

        refreshScope.refresh("envConfig");
    }
}
