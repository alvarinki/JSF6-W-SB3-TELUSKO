package org.acf.config;

import org.acf.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    //@Bean(name= {"principalDesktop", "desktopBean"})
    //@Bean(name= {"principalDesktop", "desktopBean"})
    @Bean
    public Desktop desktop() {
        return new Desktop();
    }


}
