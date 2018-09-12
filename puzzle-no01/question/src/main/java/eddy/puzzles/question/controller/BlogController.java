package eddy.puzzles.question.controller;

import eddy.puzzles.question.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogController {

    @Autowired
    private BlogService blogService;

    //blogService 호출 로직 생략

}
