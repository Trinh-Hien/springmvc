package com.trinhthihien.controller;

import com.trinhthihien.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ListCustomerController {
    @Autowired
    private CustomerService customerService;
    @GetMapping("danhsachkhachhang")
    public ModelAndView showListCustomer(@RequestParam(required = false)Integer currentPage, ModelMap model){
        try{
            if(currentPage==null){
                currentPage=1;
            }
            int recordPerPage = 5;
            int rows= customerService.numberOfRecord();
            int noOfPage= rows/recordPerPage;
            if(rows%recordPerPage>0){
                noOfPage++;
            }
            model.addAttribute("currentPage", currentPage);
            model.addAttribute("noOfPages",noOfPage);
            model.addAttribute("list",customerService.getCustomers(currentPage,recordPerPage));
        }catch(DataAccessException e){
            model.addAttribute("error",e.getMessage());
            return new ModelAndView("redirect:error",model);
        }
        return new ModelAndView("danhsachkhachhang");
    }
}
