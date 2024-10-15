package com.ss17b3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class HomeController
{

    @GetMapping
    public String home()
    {
        return "menu_sandwichs";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@RequestParam("condiments") List<String> condiments, Model model)
    {
        model.addAttribute("condiments", condiments);
        return "orders";
    }


}
