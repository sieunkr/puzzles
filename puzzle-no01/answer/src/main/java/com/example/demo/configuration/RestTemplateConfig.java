package com.example.demo.configuration;

import org.apache.http.client.HttpClient;
import org.springframework.http.client.ClientHttpRequestFactory;

import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {

    @Bean
    public RestTemplate blogRestTemplate() {
        return new RestTemplate() {{
            setRequestFactory(new HttpComponentsClientHttpRequestFactory(HttpClientBuilder
                    .create()
                    .setConnectionManager(new PoolingHttpClientConnectionManager() {{
                        setDefaultMaxPerRoute(50);
                        setMaxTotal(200);
                    }}).build()));
        }};
    }

    @Bean
    public RestTemplate videoRestTemplate() {
        return new RestTemplate() {{
            setRequestFactory(new HttpComponentsClientHttpRequestFactory(HttpClientBuilder
                    .create()
                    .setConnectionManager(new PoolingHttpClientConnectionManager() {{
                        setDefaultMaxPerRoute(20);
                        setMaxTotal(100);
                    }}).build()));
        }};
    }
}
