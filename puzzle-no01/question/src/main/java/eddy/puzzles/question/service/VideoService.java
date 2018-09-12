package eddy.puzzles.question.service;

import eddy.puzzles.question.component.OpenApiRequestComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VideoService {

    @Autowired
    private OpenApiRequestComponent openApiRequestComponent;

    public String findAll(){
        return openApiRequestComponent.findAll("VIDEO-OPEN-API-URL");
    }
}
