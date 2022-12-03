package com.zhl.org.config;

import com.zhl.org.common.util.KIfUtill;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KifelseAutoConfiguration {

    @Bean
    public KIfUtill kIfUtillService(){
        return new KIfUtill();
    }

}
