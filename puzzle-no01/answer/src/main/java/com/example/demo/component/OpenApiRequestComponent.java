package com.example.demo.component;

import org.springframework.web.client.RestTemplate;

public class OpenApiRequestComponent {

    private final RestTemplate restTemplate;

    public OpenApiRequestComponent(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String findAll(String url){

        //restTemplate.exchange()
        return "응답 데이터";
    }

}
