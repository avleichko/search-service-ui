package com.search.service.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetingController {

    private SearchServiceConfig config;

    @Autowired
    public GreetingController(SearchServiceConfig config) {
        this.config = config;
    }

    @GetMapping("/")
    public String index(Model model) {

        return "forward:/search";
    }

    @GetMapping("/search")
    public ModelAndView search(Model model) {

        model.addAttribute("host", config.getUrl());
        model.addAttribute("port", config.getPort());

        ModelAndView mav = new ModelAndView("search");
        mav.addObject("host", config.getUrl());
        mav.addObject("port", config.getPort());
        return mav;
    }

}