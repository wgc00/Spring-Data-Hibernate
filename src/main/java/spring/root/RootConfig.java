package spring.root;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "spring.root")
@PropertySource(value = "classpath:jdbc.properties")
@Import({SpringDAOConfig.class, SpringServiceConfig.class})
public class RootConfig {

}
