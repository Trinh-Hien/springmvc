package com.trinhthihien.controller;

import com.trinhthihien.model.Computer;
import com.trinhthihien.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UpdateComputerController {
    @Autowired
    private ComputerService computerService;

    @RequestMapping("/editComputer")
    public ModelAndView editComputer(@RequestParam("id")String computerID, ModelMap model){
        try{
            Computer computer= computerService.getComputer(computerID);
            model.addAttribute("computer", computer);
        }catch(DataAccessException e){
            model.addAttribute("error",e.getMessage());
            return new ModelAndView("redirect:error",model);
        }
        return new ModelAndView("taomoimay");
    }
}
