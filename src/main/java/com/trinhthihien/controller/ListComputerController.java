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
public class ListComputerController {
    @Autowired
    private ComputerService computerService;

    @RequestMapping("/danhsachmay")
    public ModelAndView showList(@RequestParam(required = false)Integer currentPage, ModelMap model){
        try {
            if(currentPage==null){
                currentPage=1;
            }
            int recordsOfPage= 5;
            int numberOfRecords= computerService.numberOfRecords();
            int nOfPage= numberOfRecords/recordsOfPage;
            if(numberOfRecords%recordsOfPage>0){
                nOfPage++;
            }
            model.addAttribute("currentPage", currentPage);
            model.addAttribute("noOfPages",nOfPage);
            model.addAttribute("list", computerService.getAllComputers(currentPage,recordsOfPage));

        }catch (DataAccessException e){
            model.addAttribute("error",e.getMessage());
            return new ModelAndView("redirect:error",model);
        }
        return new ModelAndView("danhsachmay");
    }
}
