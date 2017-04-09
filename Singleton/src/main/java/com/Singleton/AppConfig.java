package com.Singleton;

import org.springframework.context.annotation.Bean;

/**
 * Created by Rory on 2017-04-09.
 */
public class AppConfig {
    @Bean(name = "run")
    public runEmployee setUp()
    {
        return new runEmployee();
    }

}
