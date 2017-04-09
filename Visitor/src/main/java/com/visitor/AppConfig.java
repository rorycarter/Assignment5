package com.visitor;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * Created by Rory on 2017-04-09.
 */
@Configuration
public class AppConfig {
    @Bean(name = "xbox")
    public Xbox setUp()
    {
        return new Xbox();
    }

    @Bean(name = "xboxDisplay")
    public XboxPartsDisplay setUp2()
    {
        return new XboxPartsDisplay();
    }

    @Bean(name = "controller")
    public Controller setUp3()
    {
        return new Controller("Green",400);
    }

    @Bean(name = "hdmiCable")
    public HdmiCable setUp4()
    {
        return new HdmiCable(700);
    }

    @Bean(name = "powerPlug")
    public PowerPlug setUp5()
    {
        return new PowerPlug(1,420);
    }


}
