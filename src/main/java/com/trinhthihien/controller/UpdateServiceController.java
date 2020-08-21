package com.trinhthihien.controller;

import com.trinhthihien.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/editService")
public class UpdateServiceController {
    @Autowired
    private ServiceService serviceService;
    @GetMapping
    public ModelAndView updateService(@RequestParam("id")String serviceId, ModelMap model){
        try{
            model.addAttribute("service",serviceService.getService(serviceId));
        }catch (DataAccessException e){
            model.addAttribute("error",e.getMessage());
            return new ModelAndView("redirect:error",model);
        }
        return new ModelAndView("taomoidichvu");
    }
}
