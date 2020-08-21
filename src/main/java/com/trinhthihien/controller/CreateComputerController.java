package com.trinhthihien.controller;

import com.trinhthihien.model.Computer;
import com.trinhthihien.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CreateComputerController {
    @Autowired
    private ComputerService computerService;

    @RequestMapping("/taomoimay")
    public String showForm(ModelMap model){
        return "taomoimay";
    }

    @PostMapping(value = "/taomoimay")
    public ModelAndView createComputer(@RequestParam("action") String action, @ModelAttribute Computer computer, ModelMap model){
        try {
            if (action.equals("Add")) {
                computerService.insertComputer(computer);
            }
            if(action.equals("Update")){
                computerService.updateComputer(computer);
            }
        }catch (DataAccessException e){
            model.addAttribute("error",e.getMessage());
            return new ModelAndView("redirect: error",model);
        }
        return new ModelAndView("redirect: danhsachmay");
    }
}
