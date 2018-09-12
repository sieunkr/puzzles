package eddy.puzzles.question.controller;

import eddy.puzzles.question.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VideoController {

    @Autowired
    private VideoService videoService;

    //videoService 호출 로직 생략
}
