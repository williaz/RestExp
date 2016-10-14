package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by williaz on 10/14/16.
 */
@Configuration
@ComponentScan(basePackages = {"service"})
public class RootConfig {
}
