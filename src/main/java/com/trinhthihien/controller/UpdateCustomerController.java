package com.trinhthihien.controller;

import com.trinhthihien.model.Customer;
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
@RequestMapping("editCustomer")
public class UpdateCustomerController {
    @Autowired
    private CustomerService customerService;
    @GetMapping
    public ModelAndView showFormUpdate(@RequestParam("id") String customerId, ModelMap model){
        try{
            Customer customer= customerService.getCustomer(customerId);
            model.addAttribute("customer",customer);
        }catch(DataAccessException e){
            model.addAttribute("error",e.getMessage());
            return new ModelAndView("redirect:error",model);
        }
        return new ModelAndView("taomoikhachhang");
    }


}
