package com.adapter;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * Created by Rory on 2017-04-04.
 */
public class AppConfig {
    @Bean(name = "centimetre")
    public RulerReporter setUp()
    {
        return new RulerReporter();
    }

    @Bean(name = "measureObj")
    public MeasureObject setUp1(){
        return new MeasureObject();
    }
}

