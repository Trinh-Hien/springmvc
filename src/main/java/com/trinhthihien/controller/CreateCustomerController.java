package com.trinhthihien.controller;

import com.trinhthihien.model.Customer;
import com.trinhthihien.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("taomoikhachhang")
public class CreateCustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping
    public String showForm(ModelMap model){
        return "taomoikhachhang";
    }
    @PostMapping
    public ModelAndView createCustomer(@RequestParam("action")String action,@ModelAttribute Customer customer, ModelMap model){
        try{
            if(action.equals("Add")){
                customerService.insertCustomer(customer);
            }
            if(action.equals("Update")){
                customerService.updateCustomer(customer);
            }
        }catch(DataAccessException e){
            model.addAttribute("error",e.getMessage());
            return new ModelAndView("redirect:error",model);

        }
        return new ModelAndView("redirect:danhsachkhachhang");
    }
}
