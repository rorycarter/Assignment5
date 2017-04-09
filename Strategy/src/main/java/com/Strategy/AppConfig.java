package com.Strategy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * Created by Rory on 2017-04-09.
 */
@Configuration
public class AppConfig {

    private Strategy strategy;

    @Bean(name = "context")
    public Context setUp()
    {
        return new Context(strategy);
    }

    @Bean(name = "add")
    public AddWeights setUp2()
    {
        return new AddWeights();
    }

    @Bean(name = "minus")
    public MinusWeights setUp3()
    {
        return new MinusWeights();
    }

    @Bean(name = "divide")
    public DivideWeights setUp4()
    {
        return new DivideWeights();
    }
}
