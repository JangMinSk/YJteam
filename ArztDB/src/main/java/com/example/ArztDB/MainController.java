package com.example.ArztDB;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
    @RequestMapping("/")
    public ModelAndView home() {

        ModelAndView mv = new ModelAndView();

        mv.setViewName("index");

        return mv;
    }
}