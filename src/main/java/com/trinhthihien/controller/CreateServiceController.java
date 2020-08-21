package com.trinhthihien.controller;

import com.trinhthihien.model.Service;
import com.trinhthihien.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("taomoidichvu")
public class CreateServiceController {
    @Autowired
    private ServiceService serviceService;

    @GetMapping
    public String showForm(ModelMap model){
        return "taomoidichvu";
    }

    @PostMapping
    public ModelAndView createServive(@RequestParam("action")String action, @ModelAttribute Service service, ModelMap model){
        try{
            if(action.equals("Add")){
                serviceService.insertService(service);
            }
            if(action.equals("Update")){
                serviceService.updateService(service);
            }
        }catch (DataAccessException e){
            model.addAttribute("error",e.getMessage());
            return new ModelAndView("redirect:error",model);
        }
        return new ModelAndView("redirect:danhsachdichvu");
    }
}
