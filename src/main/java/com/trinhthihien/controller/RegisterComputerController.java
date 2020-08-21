package com.trinhthihien.controller;

import com.trinhthihien.model.RegisterComputer;
import com.trinhthihien.service.RegisterComputerService;
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
@RequestMapping("dangkisdmay")
public class RegisterComputerController {
    @Autowired
    private RegisterComputerService registerComputerService;
    @GetMapping
    public String showForm(ModelMap model){
        return "dangkisdmay";
    }
    @PostMapping
    public ModelAndView insertRegisterComputer(@RequestParam("gioBDSD")String time,@RequestParam("ngayBDSD")String date,
                                               @ModelAttribute RegisterComputer registerComputer, ModelMap model){
        try{
            registerComputer.setDate(LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd")));
            registerComputer.setTime(LocalTime.parse(time, DateTimeFormatter.ofPattern("HH:mm:ss")));
            registerComputerService.insertRegister(registerComputer);

        }catch (DataAccessException e){
            model.addAttribute("error",e.getMessage());
            return new ModelAndView("redirect:error",model);
        }
        return  new ModelAndView("redirect:thongtinchitiet");
    }
}
