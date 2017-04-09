package com.Bridge;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * Created by Rory on 2017-04-03.
 */
@Configuration
public class AppConfig {
    @Bean(name = "yellowTail")
    public yellowTail setUp()
    {
        return new yellowTail();
    }

    @Bean(name = "hake")
    public Hake setUp1(){
        return new Hake();
    }


}
