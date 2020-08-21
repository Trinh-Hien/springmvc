package com.trinhthihien.controller;

import com.trinhthihien.service.DetailInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("thongtinchitiet")
public class DetailInformationController {
    @Autowired
    private DetailInformationService detailInformationService;
    @GetMapping
    public String showInformation(@RequestParam(required = false)Integer currentPage, ModelMap model){
        if(currentPage == null){
            currentPage=1;
        }
        int recordPerPage= 7;
        int rows= detailInformationService.numberOfRecord();
        int nOfPage= rows/recordPerPage;
        if(rows%recordPerPage>0){
            nOfPage++;
        }
        model.addAttribute("currentPage", currentPage);
        model.addAttribute("noOfPages", nOfPage);
        model.addAttribute("list", detailInformationService.getDetailInformation(currentPage,recordPerPage));
        return "thongtinchitiet";
    }
}
