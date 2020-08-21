package com.trinhthihien.controller;

import com.trinhthihien.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DeleteComputerController {
    @Autowired
    private ComputerService computerService;
    @RequestMapping("/deleteComputer")
    public ModelAndView deleteComputer(@RequestParam("id")String computerID, ModelMap model){
        try{
            computerService.deleteComputer(computerID);

        }catch (DataAccessException e){
            model.addAttribute("error",e.getMessage());
            return new ModelAndView("redirect:error",model);
        }
        return new ModelAndView("redirect:danhsachmay");

    }
}
