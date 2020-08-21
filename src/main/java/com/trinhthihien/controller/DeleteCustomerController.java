package com.trinhthihien.controller;

import com.trinhthihien.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("deleteCustomer")
public class DeleteCustomerController {
    @Autowired
    private CustomerService customerService;
    @GetMapping
    private ModelAndView deleteCustomer(@RequestParam("id")String computerId, ModelMap model){
        try{
            customerService.deleteCustomer(computerId);
        }catch(DataAccessException e){
            model.addAttribute("error", e.getMessage());
            return new ModelAndView("redirect: error",model);
        }
        return new ModelAndView("redirect:danhsachkhachhang");
    }
}
