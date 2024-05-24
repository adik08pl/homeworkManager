package com.stempien.homeworkManager.homework;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeworkController {

    private final HomeworkService homeworkService;

    public HomeworkController(HomeworkService homeworkService) {
        this.homeworkService = homeworkService;
    }

    @GetMapping("/getHomework")
    String getHomework(Model model){
        model.addAttribute("homeworkList", homeworkService.findAll());
        return "mainPage";
    }
    @GetMapping("/add")
    String addHomework(Model model){
        Homework homework = new Homework();
        model.addAttribute("homework",homework);
        return "addHomework";
    }
}
