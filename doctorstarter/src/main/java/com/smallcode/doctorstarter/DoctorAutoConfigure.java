package com.smallcode.doctorstarter;

import com.smallcode.doctorstarter.service.RegisterService;
import com.smallcode.doctorstarter.service.RegisterServiceImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Lenny on 2017/12/27.
 */
@Configuration
public class DoctorAutoConfigure {


    @Bean
    @ConditionalOnMissingBean(RegisterService.class)
    public RegisterService helloService() {
        RegisterService registerService = new RegisterServiceImpl();
        return registerService;
    }
}


