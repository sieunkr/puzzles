package com.example.demo.service;

import com.example.demo.component.OpenApiRequestComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class VideoService {

    @Autowired
    @Qualifier("videoApiRequestComponent")
    private OpenApiRequestComponent videoApiRequestComponent;

    public String findAll(){
        return videoApiRequestComponent.findAll("VIDEO-OPEN-API-URL");
    }
}
