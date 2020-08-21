package com.trinhthihien.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ErrorController {
    @RequestMapping("/error")
    public String showError(ModelMap model, @RequestParam("error") String error){
        model.addAttribute("error",error);
        return "error";
    }
}
