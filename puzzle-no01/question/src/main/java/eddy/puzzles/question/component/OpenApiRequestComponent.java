package eddy.puzzles.question.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class OpenApiRequestComponent {

    @Autowired
    private RestTemplate restTemplate;

    public String findAll(String url){
    
        //restTemplate.exchange()
        return "응답 데이터";
    }

}
