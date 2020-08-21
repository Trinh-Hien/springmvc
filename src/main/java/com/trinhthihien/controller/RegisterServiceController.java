package com.trinhthihien.controller;

import com.trinhthihien.model.RegisterService;
import com.trinhthihien.service.RegisterServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Controller
@RequestMapping("dangkisddichvu")
public class RegisterServiceController {
    @Autowired
    private RegisterServiceService registerServiceService;
    @GetMapping
    public String showForm(ModelMap model){
        return "dangkisddichvu";
    }

    @PostMapping
    public ModelAndView create(@RequestParam("ngay")String date, @RequestParam("gio")String time,
                               @ModelAttribute RegisterService registerService, ModelMap model){
        try{
            registerService.setDate(LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd")));
            registerService.setTime(LocalTime.parse(time,DateTimeFormatter.ofPattern("HH:mm:ss")));
            registerServiceService.insertRegisterService(registerService);
        }catch (DataAccessException e){
            model.addAttribute("error",e.getMessage());
            return new ModelAndView("redirect: error",model);
        }
        return new ModelAndView("redirect:thongtinchitiet");
    }
}
