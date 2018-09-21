package com.example.demo.configuration;

import com.example.demo.component.OpenApiRequestComponent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class OpenApiRequestComponentConfig {

    @Bean
    public OpenApiRequestComponent blogApiRequestComponent(RestTemplate blogRestTemplate){
        return new OpenApiRequestComponent(blogRestTemplate);
    }

    @Bean
    public OpenApiRequestComponent videoApiRequestComponent(RestTemplate videoRestTemplate){
        return new OpenApiRequestComponent(videoRestTemplate);
    }

}
