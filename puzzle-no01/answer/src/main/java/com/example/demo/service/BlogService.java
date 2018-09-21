package com.example.demo.service;

import com.example.demo.component.OpenApiRequestComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BlogService {

    @Autowired
    @Qualifier("blogApiRequestComponent")
    private OpenApiRequestComponent blogApiRequestComponent;

    public String findAll(){
        return blogApiRequestComponent.findAll("BLOG-OPEN-API-URL");
    }
}
